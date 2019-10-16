package com.masivian.binarytree.model;

import lombok.Data;
import java.util.Optional;

/**
 * The Binary tree class
 *
 * Represents a Binary tree
 *
 * @author Diego Sánchez
 * @date 14/11/2019
 */
@Data
public class BinaryTree extends Tree{

    /**
     * The binary tree constructor
     */
    public BinaryTree() {
        super();
    }

    /**
     * Adds a new node in the tree
     *
     * @param value the new node value
     */
    @Override
    public void addNode(final Integer value) {

        Node node = new Node(value);
        this.root.ifPresentOrElse(root -> putNode(root, node), () -> setNewRoot(node));
    }

    /**
     * Sets a new root
     *
     * @param newRoot the new root node
     */
    private void setNewRoot(Node newRoot) {

        this.root = Optional.of(newRoot);
    }

    /**
     * Puts a new node in the tree
     *
     * @param root the tree root
     * @param newNode the newNode to put
     */
    private void putNode(final Node root, final Node newNode){

        Node currentNode = root;
        while(currentNode != null) {
            if(currentNode.getValue() > newNode.getValue()){
                currentNode = goLeft(newNode, currentNode);
            } else {
                currentNode = goRight(newNode, currentNode);
            }
        }
    }

    /**
     * Goes right side of the current node
     *
     * @param newNode		the new node to put in the binary tree
     * @param currentNode	the current node
     * @return the right node or null if could put a new node.
     */
    private Node goRight(Node newNode, Node currentNode) {

        return currentNode.getRight().isPresent() ?
                currentNode.getRight().get() : putRightNode(newNode, currentNode);
    }

    /**
     * Puts the new node in the right side of the current node
     *
     * @param newNode the new node to put
     * @param currentNode the current node
     * @return a current node null to finish the process
     */
    private Node putRightNode(Node newNode, Node currentNode) {

        currentNode.setRight(Optional.of(newNode));
        currentNode = null;
        return currentNode;
    }

    /**
     * Goes right side of the current node
     *
     * @param newNode		the new node to put in the binary tree
     * @param currentNode	the current node
     * @return the right node or null if could put a new node.
     */
    private Node goLeft(Node newNode, Node currentNode) {

        return currentNode.getLeft().isPresent() ?
                currentNode.getLeft().get() : putLeftNode(newNode, currentNode);
    }

    /**
     * Goes left side of the current node
     *
     * @param newNode		the new node to put in the binary tree
     * @param currentNode	the current node
     * @return the left node or null if could put a new node.
     */
    private Node putLeftNode(Node newNode, Node currentNode) {

        currentNode.setLeft(Optional.of(newNode));
        currentNode = null;
        return currentNode;
    }

}
