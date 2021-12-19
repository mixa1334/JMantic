package org.jmantic.scmemory.model.pattern.factory;

import org.jmantic.scmemory.model.element.edge.EdgeType;
import org.jmantic.scmemory.model.element.link.LinkType;
import org.jmantic.scmemory.model.element.link.ScLink;
import org.jmantic.scmemory.model.element.node.NodeType;
import org.jmantic.scmemory.model.element.node.ScNode;
import org.jmantic.scmemory.model.pattern.ScPattern5;
import org.jmantic.scmemory.model.pattern.pattern5.ScPattern5Impl;

public class ScPattern5FactoryWithAbbreviation {
    public static ScPattern5<ScNode, NodeType, ScNode, ScNode, ScNode> getFAAAF(ScNode node1,
                                                                                EdgeType edgeType,
                                                                                NodeType nodeType,
                                                                                EdgeType relEdgeType,
                                                                                ScNode relNode) {
        return new ScPattern5Impl<>(node1, edgeType, nodeType, relEdgeType, relNode);
    }

    public static ScPattern5<ScNode, LinkType, ScNode, ScLink, ScNode> getFAAAF(ScNode node1,
                                                                                EdgeType edgeType,
                                                                                LinkType linkType,
                                                                                EdgeType relEdgeType,
                                                                                ScNode relNode) {
        return new ScPattern5Impl<>(node1, edgeType, linkType, relEdgeType, relNode);
    }

    public static ScPattern5<ScNode, NodeType, ScLink, ScNode, ScLink> getFAAAF(ScNode node1,
                                                                                EdgeType edgeType,
                                                                                NodeType nodeType,
                                                                                EdgeType relEdgeType,
                                                                                ScLink relLink) {
        return new ScPattern5Impl<>(node1, edgeType, nodeType, relEdgeType, relLink);
    }

    public static ScPattern5<ScNode, LinkType, ScLink, ScLink, ScLink> getFAAAF(ScNode node1,
                                                                                EdgeType edgeType,
                                                                                LinkType linkType,
                                                                                EdgeType relEdgeType,
                                                                                ScLink relLink) {
        return new ScPattern5Impl<>(node1, edgeType, linkType, relEdgeType, relLink);
    }

    public static ScPattern5<ScNode, ScNode, NodeType, ScNode, ScNode> getFAFAA(ScNode node1,
                                                                                EdgeType edgeType,
                                                                                ScNode nodeType,
                                                                                EdgeType relEdgeType,
                                                                                NodeType relNode) {
        return new ScPattern5Impl<>(node1, edgeType, nodeType, relEdgeType, relNode);
    }

    public static ScPattern5<ScNode, ScLink, NodeType, ScLink, ScNode> getFAFAA(ScNode node1,
                                                                                EdgeType edgeType,
                                                                                ScLink linkType,
                                                                                EdgeType relEdgeType,
                                                                                NodeType relNode) {
        return new ScPattern5Impl<>(node1, edgeType, linkType, relEdgeType, relNode);
    }

    public static ScPattern5<ScNode, ScNode, LinkType, ScNode, ScLink> getFAFAA(ScNode node1,
                                                                                EdgeType edgeType,
                                                                                ScNode nodeType,
                                                                                EdgeType relEdgeType,
                                                                                LinkType relLink) {
        return new ScPattern5Impl<>(node1, edgeType, nodeType, relEdgeType, relLink);
    }

    public static ScPattern5<ScNode, ScLink, LinkType, ScLink, ScLink> getFAFAA(ScNode node1,
                                                                                EdgeType edgeType,
                                                                                ScLink linkType,
                                                                                EdgeType relEdgeType,
                                                                                LinkType relLink) {
        return new ScPattern5Impl<>(node1, edgeType, linkType, relEdgeType, relLink);
    }

    public static ScPattern5<ScLink, NodeType, ScNode, ScNode, ScNode> getFAAAF(ScLink node1,
                                                                                EdgeType edgeType,
                                                                                NodeType nodeType,
                                                                                EdgeType relEdgeType,
                                                                                ScNode relNode) {
        return new ScPattern5Impl<>(node1, edgeType, nodeType, relEdgeType, relNode);
    }

    public static ScPattern5<ScLink, LinkType, ScNode, ScLink, ScNode> getFAAAF(ScLink node1,
                                                                                EdgeType edgeType,
                                                                                LinkType linkType,
                                                                                EdgeType relEdgeType,
                                                                                ScNode relNode) {
        return new ScPattern5Impl<>(node1, edgeType, linkType, relEdgeType, relNode);
    }

    public static ScPattern5<ScLink, NodeType, ScLink, ScNode, ScLink> getFAAAF(ScLink node1,
                                                                                EdgeType edgeType,
                                                                                NodeType nodeType,
                                                                                EdgeType relEdgeType,
                                                                                ScLink relLink) {
        return new ScPattern5Impl<>(node1, edgeType, nodeType, relEdgeType, relLink);
    }

    public static ScPattern5<ScLink, LinkType, ScLink, ScLink, ScLink> getFAAAF(ScLink node1,
                                                                                EdgeType edgeType,
                                                                                LinkType linkType,
                                                                                EdgeType relEdgeType,
                                                                                ScLink relLink) {
        return new ScPattern5Impl<>(node1, edgeType, linkType, relEdgeType, relLink);
    }

    public static ScPattern5<ScLink, ScNode, NodeType, ScNode, ScNode> getFAFAA(ScLink node1,
                                                                                EdgeType edgeType,
                                                                                ScNode nodeType,
                                                                                EdgeType relEdgeType,
                                                                                NodeType relNode) {
        return new ScPattern5Impl<>(node1, edgeType, nodeType, relEdgeType, relNode);
    }

    public static ScPattern5<ScLink, ScLink, NodeType, ScLink, ScNode> getFAFAA(ScLink node1,
                                                                                EdgeType edgeType,
                                                                                ScLink linkType,
                                                                                EdgeType relEdgeType,
                                                                                NodeType relNode) {
        return new ScPattern5Impl<>(node1, edgeType, linkType, relEdgeType, relNode);
    }

    public static ScPattern5<ScLink, ScNode, LinkType, ScNode, ScLink> getFAFAA(ScLink node1,
                                                                                EdgeType edgeType,
                                                                                ScNode nodeType,
                                                                                EdgeType relEdgeType,
                                                                                LinkType relLink) {
        return new ScPattern5Impl<>(node1, edgeType, nodeType, relEdgeType, relLink);
    }

    public static ScPattern5<ScLink, ScLink, LinkType, ScLink, ScLink> getFAFAA(ScLink node1,
                                                                                EdgeType edgeType,
                                                                                ScLink linkType,
                                                                                EdgeType relEdgeType,
                                                                                LinkType relLink) {
        return new ScPattern5Impl<>(node1, edgeType, linkType, relEdgeType, relLink);
    }
}