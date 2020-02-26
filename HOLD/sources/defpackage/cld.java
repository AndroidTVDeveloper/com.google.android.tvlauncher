package defpackage;

import android.database.Cursor;

/* renamed from: cld  reason: default package */
/* compiled from: PG */
public final class cld extends cjp {
    public int b = 0;

    public cld(Cursor cursor) {
        super(cursor);
        d();
    }

    public final void d() {
        Cursor cursor = this.a;
        int i = 0;
        if (cursor == null || cursor.getCount() == 0) {
            this.b = 0;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int position = this.a.getPosition();
        this.a.moveToFirst();
        while (Long.valueOf(this.a.getLong(42)).compareTo(Long.valueOf(currentTimeMillis)) > 0) {
            i++;
            if (!this.a.moveToNext()) {
                break;
            }
        }
        this.a.moveToPosition(position);
        this.b = i;
    }

    public final int b() {
        return super.b() - this.b;
    }

    public final int b(int i, int i2) {
        return super.b(i + this.b, i2);
    }

    public final long a(int i, int i2) {
        return super.a(i + this.b, i2);
    }

    public final String c(int i, int i2) {
        return super.c(i + this.b, i2);
    }
}
