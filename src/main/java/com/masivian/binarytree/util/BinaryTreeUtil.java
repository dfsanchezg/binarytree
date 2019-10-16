package com.masivian.binarytree.util;

import com.masivian.binarytree.model.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * The Binary tree util
 *
 * contains the binary tree utility options
 *
 * @author Diego Sánchez
 * @date 14/11/2019
 */
public class BinaryTreeUtil {

    /**
     * Gets the inorder route
     *
     * @param node the node
     * @param tree acumulator string with the route
     * @return a string with the inorder route
     */
    public static List<Integer> inOrder(Node node, List<Integer> tree) {

        if (node != null){
            inOrder(node.getLeft().orElse(null), tree);
            tree.add(node.getValue());
            inOrder(node.getRight().orElse(null), tree);
        }
        return tree;
    }

    /**
     * Gets the ancestor node of two nodes, validates if the given values are greater o lesser than the node
     * if are lesser goes left or if there are greater goes right, otherwise the node is the closer ancestor
     *
     * @param currentNode the current node to verify
     * @param firstValue the first value to compare
     * @param secondValue the second value to compare
     * @return the ancestor node
     */
    public static Node findAncestorByNodes(Node currentNode, Integer firstValue, Integer secondValue) {

        List<Integer> binaryTree = inOrder(currentNode, new ArrayList<Integer>());
        return binaryTree.contains(firstValue) && binaryTree.contains(secondValue) ?
                getAncestor(currentNode, firstValue, secondValue) : null;
    }

    /**
     * Gets the ancestor
     *
     * @param currentNode The current node
     * @param firstValue The first value
     * @param secondValue The second value
     * @return the node ancestor
     */
    private static Node getAncestor(Node currentNode, Integer firstValue, Integer secondValue) {

        if(isLeftSideTree(currentNode, firstValue, secondValue)) {
            return getAncestor(currentNode.getLeft().get(), firstValue, secondValue);
        } else if(isRightSideTree(currentNode, firstValue, secondValue)) {
            return getAncestor(currentNode.getRight().get(), firstValue, secondValue);
        }
        return currentNode;
    }

    /**
     * Validates if the two values are lesser than the current node
     *
     * @param currentNode the current node to verify
     * @param firstValue the first value to compare
     * @param secondValue the second value to compare
     * @return true if there are lesser otherwise false
     */
    private static Boolean isLeftSideTree(Node currentNode, Integer firstValue, Integer secondValue) {

        return firstValue < currentNode.getValue() && secondValue < currentNode.getValue();
    }

    /**
     * Validates if the two values are greater than the current node
     *
     * @param currentNode the current node to verify
     * @param firstValue the first value to compare
     * @param secondValue the second value to compare
     * @return true if there are greater otherwise false
     */
    private static Boolean isRightSideTree(Node currentNode, Integer firstValue, Integer secondValue) {

        return firstValue > currentNode.getValue() && secondValue > currentNode.getValue();
    }
}
