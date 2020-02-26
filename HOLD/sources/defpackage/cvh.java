package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;

/* renamed from: cvh  reason: default package */
/* compiled from: PG */
public final class cvh implements Comparable {
    public static final String[] a = {"input_id", "state", "type", "parent_id", "title", "intent_uri", "icon_uri", "selected_icon_uri", "active_icon_uri", "selected_active_icon_uri", "group_id"};
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public Intent g;
    public final Uri h;
    public final Uri i;
    public final Uri j;
    public final Uri k;
    public final String l;
    public String m;
    public int n;
    public int o;

    public final String toString() {
        return this.e;
    }

    private /* synthetic */ cvh(String str, int i2, String str2, String str3, String str4, Uri uri, Uri uri2, Uri uri3, Uri uri4, String str5) {
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.h = uri;
        this.i = uri2;
        this.j = uri3;
        this.k = uri4;
        this.l = str5;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        cvh cvh = (cvh) obj;
        int compare = Integer.compare(this.o, cvh.o);
        return compare == 0 ? Integer.compare(this.n, cvh.n) : compare;
    }

    public static cvh a(Context context, Cursor cursor) {
        cvg cvg = new cvg();
        cvg.a = cursor.getString(0);
        cvg.b = cursor.getInt(1);
        cvg.c = cursor.getString(2);
        cvg.d = cursor.getString(3);
        cvg.e = cursor.getString(4);
        cvg.f = cursor.getString(5);
        String string = cursor.getString(6);
        String string2 = cursor.getString(7);
        String string3 = cursor.getString(8);
        String string4 = cursor.getString(9);
        cvg.g = dcy.a(string);
        cvg.h = dcy.a(string2);
        cvg.i = dcy.a(string3);
        cvg.j = dcy.a(string4);
        cvg.k = cursor.getString(10);
        if (cvg.g == null) {
            Integer num = (Integer) cvm.a.get(cvg.c);
            if (num != null) {
                cvg.g = new Uri.Builder().scheme("android.resource").authority(context.getPackageName()).appendPath("drawable").appendPath(context.getResources().getResourceEntryName(cvm.a(num.intValue()).intValue())).build();
            }
        }
        return new cvh(cvg.a, cvg.b, cvg.d, cvg.e, cvg.f, cvg.g, cvg.h, cvg.i, cvg.j, cvg.k);
    }
}
