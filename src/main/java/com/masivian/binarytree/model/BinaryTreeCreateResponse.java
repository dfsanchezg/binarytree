package com.masivian.binarytree.model;

import lombok.Data;

/**
 * The response creation class
 *
 * @author Diego Sánchez
 * @date 15/11/2019
 */
@Data
public class BinaryTreeCreateResponse {

    /** The found ancestor */
    private Integer ancestor;
    /** The binary tree */
    private String binaryTree;

    /**
     * The BinaryTreeCreateResponse construct
     *
     * @param ancestor the ancestor
     * @param binaryTree the binaryTree
     */
    public BinaryTreeCreateResponse(Integer ancestor, String binaryTree) {
        this.ancestor = ancestor;
        this.binaryTree = binaryTree;
    }
}
