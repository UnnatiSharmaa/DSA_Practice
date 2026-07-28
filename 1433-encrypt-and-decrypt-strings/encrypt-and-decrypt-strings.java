import java.util.*;

class Encrypter {
    private Map<Character, String> encMap; // char -> encrypted string
    private Map<String, List<Character>> decMap; // encrypted string -> possible chars
    private Set<String> dictSet; // dictionary words
    private Map<String, Integer> encryptedDictCount; // encryptedWord -> count of dict words

    public Encrypter(char[] keys, String[] values, String[] dictionary) {
        encMap = new HashMap<>();
        decMap = new HashMap<>();
        dictSet = new HashSet<>(Arrays.asList(dictionary));
        encryptedDictCount = new HashMap<>();

        // build maps
        for (int i = 0; i < keys.length; i++) {
            encMap.put(keys[i], values[i]);
            decMap.computeIfAbsent(values[i], k -> new ArrayList<>()).add(keys[i]);
        }

        // precompute encrypted dictionary words
        for (String word : dictionary) {
            String enc = encrypt(word);
            if (!enc.isEmpty()) {
                encryptedDictCount.put(enc, encryptedDictCount.getOrDefault(enc, 0) + 1);
            }
        }
    }

    public String encrypt(String word1) {
        StringBuilder sb = new StringBuilder();
        for (char c : word1.toCharArray()) {
            if (!encMap.containsKey(c)) return "";
            sb.append(encMap.get(c));
        }
        return sb.toString();
    }

    public int decrypt(String word2) {
        // Instead of generating all possible decrypts, just check precomputed dictionary encryptions
        return encryptedDictCount.getOrDefault(word2, 0);
    }
}
