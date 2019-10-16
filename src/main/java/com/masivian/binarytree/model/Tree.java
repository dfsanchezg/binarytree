package com.masivian.binarytree.model;

import lombok.Data;

import java.util.Optional;

/**
 * The tree abstract class
 *
 * This class represents a tree
 *
 * @author  Diego Sanchez
 * @date 14/10/2019
 */
@Data
public abstract class Tree {

    /** The root node */
    protected Optional<Node> root;

    /**
     * The tree constructor
     */
    public Tree() {
        this.root = Optional.empty();
    }

    /**
     * Adds a new node
     *
     * @param value the node value
     */
    public abstract void addNode(Integer value);

}
