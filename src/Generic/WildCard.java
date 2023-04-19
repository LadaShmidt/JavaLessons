package Generic;
import java.util.List;
/*
 * В языке программирования Java символ * также используется как wildcard в generic-типах.
 * Wildcard в generic-типах используется для указания неопределенного типа или ограничения типа для типовых параметров.
 *
 * Wildcards в generic-типах имеют два типа:
 *
 * Upper-bounded wildcard: <? extends T>, где T - это тип, который будет использоваться в качестве ограничения.
 * Этот wildcard позволяет использовать типы, которые являются подтипами T.
 *
 * Lower-bounded wildcard: <? super T>, где T - это тип, который будет использоваться в качестве ограничения.
 * Этот wildcard позволяет использовать типы, которые являются супертипами T.
*/
public class WildCard {
    public static void showListInfo(List<?> list) {
        System.out.println(list);
    }
}
