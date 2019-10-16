package com.masivian.binarytree.model;

import com.masivian.binarytree.util.BinaryTreeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The Binary tree test
 *
 * @author Diego Sánchez
 * @date 14/10/2019
 */

public class BinaryTreeTest {


    /**
     * Test create binary tree case 1
     *
     * Validates the correct binary tree creation
     */
    @Test
    public void testCreateBinaryTreeCase1() {

        String inOrderMockCase1 = "28,29,39,44,67,74,76,83,85,87";
        BinaryTree binaryTreeCase1 = new BinaryTree();
        Stream<Integer> listNodes = Stream.of(67,39,28,29,44,76,74,85,87,83);

        listNodes.forEach(node -> binaryTreeCase1.addNode(node));
        List<Integer> treeInOrder = new ArrayList<>();
        treeInOrder = BinaryTreeUtil.inOrder(binaryTreeCase1.getRoot().get(), treeInOrder);
        String inOrderCase1 = treeInOrder.stream().map(value -> value.toString()).collect(Collectors.joining(","));
        Assert.assertTrue(inOrderMockCase1.equals(inOrderCase1));
    }

    /**
     * Test create binary tree case 2
     *
     * Validates the correct binary tree creation
     */
    @Test
    public void testCreateBinaryTreeCase2() {

        String inOrderMockCase2 = "5,10,28,30,40";
        BinaryTree binaryTreeCase2 = new BinaryTree();
        Stream<Integer> listNodes = Stream.of(40,10,5,30,28);

        listNodes.forEach(node -> binaryTreeCase2.addNode(node));
        List<Integer> treeInOrder = new ArrayList<>();
        treeInOrder = BinaryTreeUtil.inOrder(binaryTreeCase2.getRoot().get(), treeInOrder);
        String inOrderCase2 = treeInOrder.stream().map(value -> value.toString()).collect(Collectors.joining(","));
        Assert.assertTrue(inOrderMockCase2.equals(inOrderCase2));
    }

    /**
     * Test create binary tree case 3
     *
     * Validates the correct binary tree creation with 30,000 nodes
     */
    @Test
    public void testCreateBinaryTreeCase3() {

        BinaryTree binaryTreeCase3 = new BinaryTree();

        Stream<Integer> listNodes = Stream.iterate(0, i -> i + 1).limit(30000);
        listNodes.forEach(node -> binaryTreeCase3.addNode(node));
        Assert.assertNotNull(binaryTreeCase3.getRoot());
    }
}
