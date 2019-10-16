package com.masivian.binarytree.service;

import com.masivian.binarytree.model.BinaryTree;
import com.masivian.binarytree.model.BinaryTreeCreateRequest;
import com.masivian.binarytree.model.BinaryTreeCreateResponse;
import com.masivian.binarytree.model.Node;
import com.masivian.binarytree.util.BinaryTreeUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The binary tree service
 *
 * @author Diego Sánchez
 * @date 15/10/2019
 */
@Service
public class BinaryTreeService {

    /**
     * Finds the binary tree ancestor given 2 numbers
     *
     * @param binaryTreeCreateRequest the binaryTreeCreateRequest
     * @return the ancestor
     */
    public BinaryTreeCreateResponse findBinaryTreeAncestor(BinaryTreeCreateRequest binaryTreeCreateRequest){

        BinaryTree binaryTree = createBinaryTree(binaryTreeCreateRequest.getValues());
        Node ancestor = BinaryTreeUtil.findAncestorByNodes(binaryTree.getRoot().get(),
                binaryTreeCreateRequest.getFirstValue(), binaryTreeCreateRequest.getSecondValue());
        return new BinaryTreeCreateResponse(ancestor.getValue(), getBinaryTreeInOrder(binaryTree)) ;
    }

    /**
     * Creates a binary tree
     *
     * @param nodes the list of nodes
     * @return The binary Tree build
     */
    public BinaryTree createBinaryTree(List<Integer> nodes){

        BinaryTree binaryTree = new BinaryTree();
        nodes.forEach(node -> binaryTree.addNode(node));
        return binaryTree;
    }

    /**
     * Gives the binary tree inorder traversal
     *
     * @param binaryTree the binary tree
     * @return the inorder traversal
     */
    private String getBinaryTreeInOrder(BinaryTree binaryTree){
        return BinaryTreeUtil.inOrder(binaryTree.getRoot().get(),
                new ArrayList<>()).stream().map(value -> value.toString()).collect(Collectors.joining(","));
    }
}
