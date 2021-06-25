import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import com.flipkart.zjsonpatch.JsonDiff;
import org.javers.common.string.PrettyValuePrinter;
import org.javers.core.JaversBuilder;
import org.javers.core.JaversCoreProperties;
import org.javers.repository.jql.JqlQuery;

import java.util.Map;

public class YamlDiff {

    public static void main(String[] args) throws Exception {
        var mapper = new YAMLMapper();
        var javers = JaversBuilder.javers().build();

        var base = mapper.readTree(YamlDiff.class.getResourceAsStream("/base.yaml"));
        var modified = mapper.readTree(YamlDiff.class.getResourceAsStream("/modified.yaml"));

        var diff = javers.compare(base, modified);
        System.out.println("========== Javers =============\n");
        System.out.println(diff.prettyPrint());

        System.out.println("\n\n\n========== JsonPatch =============\n");
        JsonNode patch = JsonDiff.asJson(base, modified);
        System.out.println(patch.toPrettyString());
    }
}
