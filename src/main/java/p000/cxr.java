package p000;

import android.database.Cursor;

/* renamed from: cxr */
/* compiled from: PG */
public final class cxr implements Comparable {

    /* renamed from: k */
    public static final String[] f7855k = {"_id", "display_name", "browsable", "system_channel_key", "configuration_display_order", "logo_content_description", "package_name", "internal_provider_data"};

    /* renamed from: a */
    public long f7856a;

    /* renamed from: b */
    public String f7857b;

    /* renamed from: c */
    public boolean f7858c;

    /* renamed from: d */
    public String f7859d;

    /* renamed from: e */
    public int f7860e;

    /* renamed from: f */
    public String f7861f;

    /* renamed from: g */
    public String f7862g;

    /* renamed from: h */
    public boolean f7863h;

    /* renamed from: i */
    public boolean f7864i;

    /* renamed from: j */
    public boolean f7865j = true;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        cxr cxr = (cxr) obj;
        String str = this.f7857b;
        if (str == null && cxr.f7857b == null) {
            return 0;
        }
        if (str == null) {
            return 1;
        }
        String str2 = cxr.f7857b;
        if (str2 == null) {
            return -1;
        }
        return str.compareToIgnoreCase(str2);
    }

    /* renamed from: a */
    public static cxr m5909a(Cursor cursor) {
        cxr cxr = new cxr();
        cxr.f7856a = cursor.getLong(0);
        boolean z = true;
        cxr.f7857b = cursor.getString(1);
        if (cursor.getInt(2) != 1) {
            z = false;
        }
        cxr.f7858c = z;
        cxr.f7859d = cursor.getString(3);
        cxr.f7860e = cursor.getInt(4);
        cxr.f7861f = cursor.getString(5);
        String string = cursor.getString(6);
        cxr.f7862g = string;
        if ("com.google.android.tvrecommendations".equals(string) && cursor.getBlob(7) != null) {
            byte[] blob = cursor.getBlob(7);
            String str = new String(blob, 0, blob.length - 1);
            if (!"sponsored.legacy".equals(str)) {
                cxr.f7862g = str;
            }
        }
        return cxr;
    }

    public final String toString() {
        long j = this.f7856a;
        String str = this.f7857b;
        boolean z = this.f7858c;
        String str2 = this.f7862g;
        int i = this.f7860e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 121 + String.valueOf(str2).length());
        sb.append("Channel{id=");
        sb.append(j);
        sb.append(", displayName='");
        sb.append(str);
        sb.append("', browsable=");
        sb.append(z);
        sb.append(", packageName='");
        sb.append(str2);
        sb.append("', configurationDisplayOrder=");
        sb.append(i);
        sb.append("'}");
        return sb.toString();
    }
}
