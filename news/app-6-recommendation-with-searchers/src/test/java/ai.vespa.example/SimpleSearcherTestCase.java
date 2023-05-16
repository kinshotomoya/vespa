package ai.vespa.example;

import com.yahoo.component.chain.Chain;
import com.yahoo.search.*;
import com.yahoo.search.searchchain.*;
import ai.vespa.example.SimpleSearcher;
import org.junit.Test;

public class SimpleSearcherTestCase extends junit.framework.TestCase {
    @Test
    public void testBasics() {
        // Create chain
        Chain<Searcher> searchChain = new Chain<Searcher>(new SimpleSearcher());

        // Create an empty context, in a running container this would be
        // populated with settings used by different searcher. Tests must
        // set this according to their own requirements.
        Execution.Context context = Execution.Context.createContextStub();
        Execution execution = new Execution(searchChain, context);

        // Execute it
        Result result = execution.search(new Query("query"));

        // Assert the result has the expected hit by scanning for the ID
        assertNotNull(result.hits().get(0));
    }
}
