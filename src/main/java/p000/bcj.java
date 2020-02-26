package p000;

import java.io.BufferedReader;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: bcj */
/* compiled from: PG */
final class bcj {

    /* renamed from: a */
    private final BufferedReader f3277a;

    /* renamed from: b */
    private final Queue f3278b;

    /* renamed from: c */
    private String f3279c;

    public bcj(Queue queue, BufferedReader bufferedReader) {
        this.f3278b = queue;
        this.f3277a = bufferedReader;
    }

    /* renamed from: a */
    public final boolean mo1762a() {
        String trim;
        if (this.f3279c == null) {
            if (this.f3278b.isEmpty()) {
                do {
                    String readLine = this.f3277a.readLine();
                    this.f3279c = readLine;
                    if (readLine == null) {
                        return false;
                    }
                    trim = readLine.trim();
                    this.f3279c = trim;
                } while (trim.isEmpty());
                return true;
            }
            this.f3279c = (String) bks.m3507a((Object) ((String) this.f3278b.poll()));
        }
        return true;
    }

    /* renamed from: b */
    public final String mo1763b() {
        if (mo1762a()) {
            String str = this.f3279c;
            this.f3279c = null;
            return str;
        }
        throw new NoSuchElementException();
    }
}
