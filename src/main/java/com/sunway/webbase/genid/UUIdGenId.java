package com.sunway.webbase.genid;

import tk.mybatis.mapper.genid.GenId;

import java.util.UUID;

/**
 * @author Kiuyam
 */
public class UUIdGenId implements GenId<String> {
    @Override
    public String genId(String table, String column) {
        return UUID.randomUUID().toString();
    }
}
