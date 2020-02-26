package defpackage;

import android.database.Cursor;

/* renamed from: cjp  reason: default package */
/* compiled from: PG */
public class cjp {
    public final Cursor a;

    public cjp(Cursor cursor) {
        this.a = cursor;
    }

    public final void c() {
        if (this.a.isClosed()) {
            throw new IllegalArgumentException("Buffer is released.");
        }
    }

    public int b() {
        c();
        return this.a.getCount();
    }

    public int b(int i, int i2) {
        c();
        this.a.moveToPosition(i);
        return this.a.getInt(i2);
    }

    public long a(int i, int i2) {
        c();
        this.a.moveToPosition(i);
        return this.a.getLong(i2);
    }

    public String c(int i, int i2) {
        c();
        this.a.moveToPosition(i);
        return this.a.getString(i2);
    }

    public final void a() {
        this.a.close();
    }

    public cjp(Cursor cursor, byte b) {
        this(cursor);
    }
}
