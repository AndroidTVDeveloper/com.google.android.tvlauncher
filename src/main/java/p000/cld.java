package p000;

import android.database.Cursor;

/* renamed from: cld */
/* compiled from: PG */
public final class cld extends cjp {

    /* renamed from: b */
    public int f5896b = 0;

    public cld(Cursor cursor) {
        super(cursor);
        mo3082d();
    }

    /* renamed from: d */
    public final void mo3082d() {
        Cursor cursor = this.f5730a;
        int i = 0;
        if (cursor == null || cursor.getCount() == 0) {
            this.f5896b = 0;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int position = this.f5730a.getPosition();
        this.f5730a.moveToFirst();
        while (Long.valueOf(this.f5730a.getLong(42)).compareTo(Long.valueOf(currentTimeMillis)) > 0) {
            i++;
            if (!this.f5730a.moveToNext()) {
                break;
            }
        }
        this.f5730a.moveToPosition(position);
        this.f5896b = i;
    }

    /* renamed from: b */
    public final int mo2918b() {
        return super.mo2918b() - this.f5896b;
    }

    /* renamed from: b */
    public final int mo2919b(int i, int i2) {
        return super.mo2919b(i + this.f5896b, i2);
    }

    /* renamed from: a */
    public final long mo2916a(int i, int i2) {
        return super.mo2916a(i + this.f5896b, i2);
    }

    /* renamed from: c */
    public final String mo2920c(int i, int i2) {
        return super.mo2920c(i + this.f5896b, i2);
    }
}
