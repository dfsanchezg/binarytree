package com.masivian.binarytree.util;

import com.masivian.binarytree.model.BinaryTree;
import com.masivian.binarytree.model.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

/**
 * The Binary tree util test
 *
 * @author Diego Sánchez
 * @date 14/10/2019
 */
public class BinaryTreeUtilTest {

    /**
     * Test to validate the find ancestor method
     */
    @Test
    public void findAncestorNodeTest() {

        Integer case1Mock = 39;
        Integer case2Mock = 67;
        Integer case3Mock = 85;
        BinaryTree binaryTree = new BinaryTree();
        Stream<Integer> listNodes = Stream.of(67,39,28,29,44,76,74,85,87,83);
        listNodes.forEach(node -> binaryTree.addNode(node));

        Node ancestor = BinaryTreeUtil.findAncestorByNodes(binaryTree.getRoot().get(), 29, 44);
        Assert.assertTrue(case1Mock == ancestor.getValue());
        ancestor = BinaryTreeUtil.findAncestorByNodes(binaryTree.getRoot().get(), 44, 85);
        Assert.assertTrue(case2Mock == ancestor.getValue());
        ancestor = BinaryTreeUtil.findAncestorByNodes(binaryTree.getRoot().get(), 83, 87);
        Assert.assertTrue(case3Mock == ancestor.getValue());
    }

    /**
     * Test to validate the find ancestor method
     */
    @Test
    public void noExistValueInsideTreeTest() {

        BinaryTree binaryTree = new BinaryTree();
        Stream<Integer> listNodes = Stream.of(67,39,28,29,44,76,74,85,87,83);
        listNodes.forEach(node -> binaryTree.addNode(node));

        Node ancestor = BinaryTreeUtil.findAncestorByNodes(binaryTree.getRoot().get(), 29, 90);
        Assert.assertNull(ancestor);
    }
}
