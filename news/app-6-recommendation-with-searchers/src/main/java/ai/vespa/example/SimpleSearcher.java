package ai.vespa.example;

import com.yahoo.search.Query;
import com.yahoo.search.Result;
import com.yahoo.search.Searcher;
import com.yahoo.search.result.Hit;
import com.yahoo.search.searchchain.Execution;

public class SimpleSearcher extends Searcher {
    @Override
    public Result search(Query query, Execution execution) {
        Result result = execution.search(query);
        Hit hit = new Hit("hello");
        hit.setField("message", "hello");
        result.hits().add(hit);
        return result;
    }
}
