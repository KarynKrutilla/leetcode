package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/encode-and-decode-tinyurl/#/description
 */
public class EncodeAndDecodeTinyUrl {
    Map<Integer, String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int hashCode = longUrl.hashCode();
        map.put(hashCode, longUrl);
        return String.valueOf(hashCode);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int hashCode = Integer.valueOf(shortUrl);
        return map.get(hashCode);
    }
}
