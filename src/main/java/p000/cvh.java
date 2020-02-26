package p000;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;

/* renamed from: cvh */
/* compiled from: PG */
public final class cvh implements Comparable {

    /* renamed from: a */
    public static final String[] f7645a = {"input_id", "state", "type", "parent_id", "title", "intent_uri", "icon_uri", "selected_icon_uri", "active_icon_uri", "selected_active_icon_uri", "group_id"};

    /* renamed from: b */
    public final String f7646b;

    /* renamed from: c */
    public final int f7647c;

    /* renamed from: d */
    public final String f7648d;

    /* renamed from: e */
    public final String f7649e;

    /* renamed from: f */
    public final String f7650f;

    /* renamed from: g */
    public Intent f7651g;

    /* renamed from: h */
    public final Uri f7652h;

    /* renamed from: i */
    public final Uri f7653i;

    /* renamed from: j */
    public final Uri f7654j;

    /* renamed from: k */
    public final Uri f7655k;

    /* renamed from: l */
    public final String f7656l;

    /* renamed from: m */
    public String f7657m;

    /* renamed from: n */
    public int f7658n;

    /* renamed from: o */
    public int f7659o;

    public final String toString() {
        return this.f7649e;
    }

    private /* synthetic */ cvh(String str, int i, String str2, String str3, String str4, Uri uri, Uri uri2, Uri uri3, Uri uri4, String str5) {
        this.f7646b = str;
        this.f7647c = i;
        this.f7648d = str2;
        this.f7649e = str3;
        this.f7650f = str4;
        this.f7652h = uri;
        this.f7653i = uri2;
        this.f7654j = uri3;
        this.f7655k = uri4;
        this.f7656l = str5;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        cvh cvh = (cvh) obj;
        int compare = Integer.compare(this.f7659o, cvh.f7659o);
        return compare == 0 ? Integer.compare(this.f7658n, cvh.f7658n) : compare;
    }

    /* renamed from: a */
    public static cvh m5729a(Context context, Cursor cursor) {
        cvg cvg = new cvg();
        cvg.f7634a = cursor.getString(0);
        cvg.f7635b = cursor.getInt(1);
        cvg.f7636c = cursor.getString(2);
        cvg.f7637d = cursor.getString(3);
        cvg.f7638e = cursor.getString(4);
        cvg.f7639f = cursor.getString(5);
        String string = cursor.getString(6);
        String string2 = cursor.getString(7);
        String string3 = cursor.getString(8);
        String string4 = cursor.getString(9);
        cvg.f7640g = dcy.m6185a(string);
        cvg.f7641h = dcy.m6185a(string2);
        cvg.f7642i = dcy.m6185a(string3);
        cvg.f7643j = dcy.m6185a(string4);
        cvg.f7644k = cursor.getString(10);
        if (cvg.f7640g == null) {
            Integer num = (Integer) cvm.f7688a.get(cvg.f7636c);
            if (num != null) {
                cvg.f7640g = new Uri.Builder().scheme("android.resource").authority(context.getPackageName()).appendPath("drawable").appendPath(context.getResources().getResourceEntryName(cvm.m5750a(num.intValue()).intValue())).build();
            }
        }
        return new cvh(cvg.f7634a, cvg.f7635b, cvg.f7637d, cvg.f7638e, cvg.f7639f, cvg.f7640g, cvg.f7641h, cvg.f7642i, cvg.f7643j, cvg.f7644k);
    }
}
