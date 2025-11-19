package ua.opnu;

import java.util.*;
import java.util.stream.*;

public class EasyTasks {

    public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(n -> n << 1)
                .collect(Collectors.toList());
    }

    public static List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(n -> (int) Math.pow(n, 2))
                .collect(Collectors.toList());
    }

    public static List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(s -> "y".concat(s).concat("y"))
                .collect(Collectors.toList());
    }

    public static List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> Math.abs(n) % 10 != 9)
                .collect(Collectors.toList());
    }

    public static List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(s -> s.chars().noneMatch(ch -> ch == 'z'))
                .collect(Collectors.toList());
    }

    public static List<String> refinedStrings(List<String> strings) {
        return strings.stream()
                .distinct()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());
    }

    public static List<String> flatten(List<String> names) {
        return names.stream()
                .flatMap(name -> Stream.of(name.split(" ")))
                .collect(Collectors.toList());
    }
}
