package com.masivian.binarytree.model;

import lombok.Data;

import java.util.Optional;

/**
 * The Node class
 *
 * This class represents a node
 *
 * @author  Diego Sanchez
 * @date 14/11/2019
 */
@Data
public class Node {

    /** The value */
    private Integer value;

    /** The left node */
    private Optional<Node> left;

    /** The right node */
    private Optional<Node> right;

    /**
     * The node constructor
     *
     * @param value the node value
     */
    public Node(Integer value) {
        this.value = value;
        this.left = Optional.empty();
        this.right = Optional.empty();
    }
}
