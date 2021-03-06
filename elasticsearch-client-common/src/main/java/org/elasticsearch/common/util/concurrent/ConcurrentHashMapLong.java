/*
 * Licensed to ElasticSearch and Shay Banon under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. ElasticSearch licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.common.util.concurrent;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/**
 *
 */
public class ConcurrentHashMapLong<T> implements ConcurrentMapLong<T> {

    private final ConcurrentMap<Long, T> map;

    public ConcurrentHashMapLong() {
        this.map = ConcurrentCollections.newConcurrentMap();
    }

    
    public T get(long key) {
        return map.get(key);
    }

    
    public T remove(long key) {
        return map.remove(key);
    }

    
    public T put(long key, T value) {
        return map.put(key, value);
    }

    
    public T putIfAbsent(long key, T value) {
        return map.putIfAbsent(key, value);
    }

    // MAP DELEGATION

    
    public boolean isEmpty() {
        return map.isEmpty();
    }

    
    public int size() {
        return map.size();
    }

    
    public T get(Object key) {
        return map.get(key);
    }

    
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    
    public boolean containsValue(Object value) {
        return map.containsValue(value);
    }

    public T put(Long key, T value) {
        return map.put(key, value);
    }

    public T putIfAbsent(Long key, T value) {
        return map.putIfAbsent(key, value);
    }

    public void putAll(Map<? extends Long, ? extends T> m) {
        map.putAll(m);
    }

    
    public T remove(Object key) {
        return map.remove(key);
    }

    
    public boolean remove(Object key, Object value) {
        return map.remove(key, value);
    }

    public boolean replace(Long key, T oldValue, T newValue) {
        return map.replace(key, oldValue, newValue);
    }

    public T replace(Long key, T value) {
        return map.replace(key, value);
    }

    
    public void clear() {
        map.clear();
    }

    
    public Set<Long> keySet() {
        return map.keySet();
    }

    
    public Collection<T> values() {
        return map.values();
    }

    
    public Set<Entry<Long, T>> entrySet() {
        return map.entrySet();
    }

    
    public boolean equals(Object o) {
        return map.equals(o);
    }

    
    public int hashCode() {
        return map.hashCode();
    }

    
    public String toString() {
        return map.toString();
    }
}
