package com.bricklink.api.rest.model.v1;

import com.bricklink.api.rest.model.v1.BricklinkMeta;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BricklinkResource<T> {
    private BricklinkMeta meta;
    private T data;
}
