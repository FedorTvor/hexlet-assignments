package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {

    private String content;
    private List<Tag> children;

    public PairedTag(String name, Map<String, String> attributes, String content, List<Tag> children) {
        super(name, attributes);
        this.content = content;
        this.children = children;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("<").append(name).append(getAttributesString()).append(">");

        if (!content.isEmpty()) {
            builder.append(content);
        }

        for (Tag child : children) {
            builder.append(child.toString());
        }

        builder.append("</").append(name).append(">");
        return builder.toString();
    }
}
// END
