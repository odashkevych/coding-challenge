package cisco.java.challenge.domain;

/**
 * GNode defines a graph element.
 */
public interface GNode {

    String getName();

    GNode[] getChildren();
}
