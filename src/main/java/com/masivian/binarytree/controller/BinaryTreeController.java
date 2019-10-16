package com.masivian.binarytree.controller;

import com.masivian.binarytree.model.BinaryTreeCreateRequest;
import com.masivian.binarytree.service.BinaryTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * The Binary tree controller
 *
 * Handler the binary tree request
 *
 * @author Diego Sánchez
 * @date 15/10/2019
 */
@RestController
@RequestMapping(path = "/binarytree")
public class BinaryTreeController {

    /**
     * The Binary tree service
     */
    @Autowired
    public BinaryTreeService binaryTreeService;

    /**
     * creates and finds the ancestor of the given tree
     *
     * @param binaryTreeCreateRequest the binaryTreeCreateRequest
     * @return The BinaryTreeCreateResponse
     */
    @PostMapping
    public ResponseEntity<?> createBinaryTree(@RequestBody BinaryTreeCreateRequest binaryTreeCreateRequest) {

        try{
            return new ResponseEntity<>(binaryTreeService.findBinaryTreeAncestor(binaryTreeCreateRequest),
                    HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
