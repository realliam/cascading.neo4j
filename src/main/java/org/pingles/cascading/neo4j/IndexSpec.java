package org.pingles.cascading.neo4j;

import cascading.tuple.Fields;

public class IndexSpec {
    private final String indexName;
    private final Fields fields;

    /**
     * Create an IndexSpec
     * @param nodeTypeName - e.g. "users", or "pages" etc.
     * @param fields
     */
    public IndexSpec(String nodeTypeName, Fields fields) {
        this.indexName = nodeTypeName;
        this.fields = fields;
    }

    public String getNodeTypeName() {
        return indexName;
    }

    public String getIndexPropertyName() {
        return (String) fields.get(0);
    }
}