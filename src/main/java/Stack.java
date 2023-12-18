import java.util.NoSuchElementException;

/**
 * Ein generisches Interface für Stapeloperationen.
 *
 * @param <E> Der Datentyp der auf dem Stapel gespeicherten Elemente.
 */
public interface Stack<E> extends Iterable<E> {
    /**
     * Fügt ein Element auf den Stapel hinzu.
     *
     * @param element Das hinzuzufügende Element.
     */
    void push(E element);

    /**
     * Entfernt das oberste Element vom Stapel und gibt es zurück.
     *
     * @return Das entfernte Element.
     * @throws NoSuchElementException Wenn der Stapel leer ist.
     */
    E pop() throws NoSuchElementException;

    /**
     * Gibt das oberste Element auf dem Stapel zurück, ohne es zu entfernen.
     *
     * @return Das oberste Element.
     * @throws NoSuchElementException Wenn der Stapel leer ist.
     */
    E top() throws NoSuchElementException;

    /**
     * Überprüft, ob der Stapel leer ist.
     *
     * @return {@code true}, wenn der Stapel leer ist, andernfalls {@code false}.
     */
    boolean isEmpty();

    /**
     * Gibt die Anzahl der Elemente auf dem Stapel zurück.
     *
     * @return Die Anzahl der Elemente auf dem Stapel.
     */
    int size();
}
