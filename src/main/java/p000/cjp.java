package p000;

import android.database.Cursor;

/* renamed from: cjp */
/* compiled from: PG */
public class cjp {

    /* renamed from: a */
    public final Cursor f5730a;

    public cjp(Cursor cursor) {
        this.f5730a = cursor;
    }

    /* renamed from: c */
    public final void mo2921c() {
        if (this.f5730a.isClosed()) {
            throw new IllegalArgumentException("Buffer is released.");
        }
    }

    /* renamed from: b */
    public int mo2918b() {
        mo2921c();
        return this.f5730a.getCount();
    }

    /* renamed from: b */
    public int mo2919b(int i, int i2) {
        mo2921c();
        this.f5730a.moveToPosition(i);
        return this.f5730a.getInt(i2);
    }

    /* renamed from: a */
    public long mo2916a(int i, int i2) {
        mo2921c();
        this.f5730a.moveToPosition(i);
        return this.f5730a.getLong(i2);
    }

    /* renamed from: c */
    public String mo2920c(int i, int i2) {
        mo2921c();
        this.f5730a.moveToPosition(i);
        return this.f5730a.getString(i2);
    }

    /* renamed from: a */
    public final void mo2917a() {
        this.f5730a.close();
    }

    public cjp(Cursor cursor, byte b) {
        this(cursor);
    }
}
