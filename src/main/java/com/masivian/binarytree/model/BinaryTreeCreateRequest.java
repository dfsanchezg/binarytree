package com.masivian.binarytree.model;

import lombok.Data;

import java.util.List;

/**
 * The request creation class
 *
 * @author Diego Sánchez
 * @date 15/10/2019
 */
@Data
public class BinaryTreeCreateRequest {

    /** The list of values */
    private List<Integer> values;
    /** The fist value to compare */
    private Integer firstValue;
    /** The second value to compare*/
    private Integer secondValue;
}
