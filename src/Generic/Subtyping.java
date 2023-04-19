/*
 * Подтипы (subtypes) в generic в Java - это типы, которые могут быть использованы в любом месте, где ожидается их супертип.
 */
package Generic;
// С помощью subtypes мы можем ограничить диапазон типов данных которые принимает наш generic
public class Subtyping <T extends Number>{
    T element;
   Subtyping(T element) {
        this.element = element;
    }
    public <T extends Number> T getElement (T element) {
        return element;
    }
}




