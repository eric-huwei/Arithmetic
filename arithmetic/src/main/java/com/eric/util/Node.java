package com.eric.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @DESCIRPTION 链表结点bean
 * @AUTHOR SCORPIO.HU
 * @DATE 2019-06-22 14:23
 */
@Getter
@Setter
@AllArgsConstructor
public class Node {

    public String data;
    public Node next;

}

