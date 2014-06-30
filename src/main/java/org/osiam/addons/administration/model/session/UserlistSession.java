package org.osiam.addons.administration.model.session;

import java.util.Collections;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;


/**
 * This class contains all userlist specific session data.
 */
@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserlistSession {
    private String query;
    private Integer limit;
    private Long offset;
    private String orderBy;
    private Boolean ascending;
    private Map<String, String> filterFields = Collections.EMPTY_MAP;
    
    public UserlistSession() {
    }

    public UserlistSession(String query, Integer limit, Long offset, String orderBy, Boolean ascending,
            Map<String, String> filterFields) {
        this.query = query;
        this.limit = limit;
        this.offset = offset;
        this.orderBy = orderBy;
        this.ascending = ascending;
        this.filterFields = filterFields;
    }

    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }
    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    public Long getOffset() {
        return offset;
    }
    public void setOffset(Long offset) {
        this.offset = offset;
    }
    public String getOrderBy() {
        return orderBy;
    }
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
    public Boolean getAscending() {
        return ascending;
    }
    public void setAscending(Boolean ascending) {
        this.ascending = ascending;
    }
    public Map<String, String> getFilterFields() {
        return filterFields;
    }
    public void setFilterFields(Map<String, String> filterFields) {
        this.filterFields = filterFields;
    }
}