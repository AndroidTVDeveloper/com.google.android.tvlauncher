package defpackage;

import java.io.BufferedReader;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: bcj  reason: default package */
/* compiled from: PG */
final class bcj {
    private final BufferedReader a;
    private final Queue b;
    private String c;

    public bcj(Queue queue, BufferedReader bufferedReader) {
        this.b = queue;
        this.a = bufferedReader;
    }

    public final boolean a() {
        String trim;
        if (this.c == null) {
            if (this.b.isEmpty()) {
                do {
                    String readLine = this.a.readLine();
                    this.c = readLine;
                    if (readLine == null) {
                        return false;
                    }
                    trim = readLine.trim();
                    this.c = trim;
                } while (trim.isEmpty());
                return true;
            }
            this.c = (String) bks.a((Object) ((String) this.b.poll()));
        }
        return true;
    }

    public final String b() {
        if (a()) {
            String str = this.c;
            this.c = null;
            return str;
        }
        throw new NoSuchElementException();
    }
}
