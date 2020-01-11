package java10.collectionapi;

import java.util.*;

public class CopyOfMethodExamples {
    public static void main(String[] args) {
        System.out.println("=-=-=-=-= List.copyOf() =-=-=-=-=");
        listCopyOf();

        System.out.println("=-=-=-=-= Set.copyOf() =-=-=-=-=");
        setCopyOf();

        System.out.println("=-=-=-=-= Map.copyOf() =-=-=-=-=");
        mapCopyOf();
    }

    /**
     * NullPointerException is thrown in case of:
     * - any element of the collection is null
     * - collection reference is null
     */
    private static void copyOfRestrictions() {
        List<Integer> copyWithNulls = List.copyOf(Arrays.asList(1, 2, null, 4, 5));

        List<Integer> nullList = null;
        List<Integer> nullListCopy = List.copyOf(nullList);
    }

    private static void listCopyOf() {
        List<Integer> mutableList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> mutableListCopy = List.copyOf(mutableList);

        System.out.println("mutableList.equals(mutableListCopy): " + mutableList.equals(mutableListCopy));
        System.out.println("mutableList == mutableListCopy: " + (mutableList == mutableListCopy));

        List<Integer> immutableList = List.of(1, 2, 3);
        List<Integer> immutableListCopy = List.copyOf(immutableList);

        System.out.println("immutableList.equals(immutableListCopy): " + immutableList.equals(immutableListCopy));
        System.out.println("immutableList == immutableListCopy: " + (immutableList == immutableListCopy));
    }

    private static void setCopyOf() {
        Set<Integer> mutableSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> mutableSetCopy = Set.copyOf(mutableSet);

        System.out.println("mutableSet.equals(mutableSetCopy): " + mutableSet.equals(mutableSetCopy));
        System.out.println("mutableSet == mutableSetCopy: " + (mutableSet == mutableSetCopy));

        Set<Integer> immutableSet = Set.of(1, 2, 3);
        Set<Integer> immutableSetCopy = Set.copyOf(immutableSet);

        System.out.println("immutableSet.equals(immutableSetCopy): " + immutableSet.equals(immutableSetCopy));
        System.out.println("immutableSet == immutableSetCopy: " + (immutableSet == immutableSetCopy));
    }

    private static void mapCopyOf() {
        Map<String, Integer> mutableMap = new HashMap<>();
        mutableMap.put("1", 1);
        mutableMap.put("2", 2);
        mutableMap.put("3", 3);
        Map<String, Integer> mutableMapCopy = Map.copyOf(mutableMap);

        System.out.println("mutableMap.equals(mutableMapCopy): " + mutableMap.equals(mutableMapCopy));
        System.out.println("mutableMap == mutableMapCopy: " + (mutableMap == mutableMapCopy));

        Map<String, Integer> immutableMap = Map.of("1", 1, "2", 2, "3", 3, "4", 4);
        Map<String, Integer> immutableMapCopy = Map.copyOf(immutableMap);

        System.out.println("immutableMap.equals(immutableMapCopy): " + immutableMap.equals(immutableMapCopy));
        System.out.println("immutableMap == immutableMapCopy: " + (immutableMap == immutableMapCopy));
    }
}
