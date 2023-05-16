チュートリアルの構築

## データ投入
```shell
$ pwd
/Users/kinsho/workspace/vespa/news
$ ../vespa-feed-client-cli/vespa-feed-client \
  --verbose --file mind/vespa_user_embeddings.json --endpoint http://localhost:8080

$ ../vespa-feed-client-cli/vespa-feed-client \
  --verbose --file mind/vespa_news_embeddings.json --endpoint http://localhost:8080
{
  "feeder.seconds" : 8.307,
  "feeder.ok.count" : 5000,
  "feeder.ok.rate" : 601.935,
  "feeder.error.count" : 0,
  "feeder.inflight.count" : 0,
  "http.request.count" : 5000,
  "http.request.bytes" : 2719512,
  "http.request.MBps" : 0.327,
  "http.exception.count" : 0,
  "http.response.count" : 5000,
  "http.response.bytes" : 378796,
  "http.response.MBps" : 0.046,
  "http.response.error.count" : 0,
  "http.response.latency.millis.min" : 445.000,
  "http.response.latency.millis.avg" : 934.000,
  "http.response.latency.millis.max" : 1844.000,
  "http.response.code.counts" : {
    "200" : 5000
  }
}%
```

## Searcherのデプロイ
```shell
$ mvn package
$ vespa deploy --wait 300 ./
```

## クエリ投げる
```shell
vespa query -v \
  'user_id=U33527' \
  'searchChain=user'
```


## index作業

削除
```shell
$ curl -X DELETE "http://localhost:8080/document/v1/mind/news/docid?selection=true&cluster=mind"
$ curl -X DELETE "http://localhost:8080/document/v1/mind/user/docid?selection=true&cluster=mind"
```

TOOD:
- vespa.jsonのデータを入れる
- ↑で検索してみる
- 複数のsearcherの組み合わせを試す
- クラスタ構成で実行できるように
