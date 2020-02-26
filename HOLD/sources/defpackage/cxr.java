package defpackage;

import android.database.Cursor;

/* renamed from: cxr  reason: default package */
/* compiled from: PG */
public final class cxr implements Comparable {
    public static final String[] k = {"_id", "display_name", "browsable", "system_channel_key", "configuration_display_order", "logo_content_description", "package_name", "internal_provider_data"};
    public long a;
    public String b;
    public boolean c;
    public String d;
    public int e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j = true;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        cxr cxr = (cxr) obj;
        String str = this.b;
        if (str == null && cxr.b == null) {
            return 0;
        }
        if (str == null) {
            return 1;
        }
        String str2 = cxr.b;
        if (str2 == null) {
            return -1;
        }
        return str.compareToIgnoreCase(str2);
    }

    public static cxr a(Cursor cursor) {
        cxr cxr = new cxr();
        cxr.a = cursor.getLong(0);
        boolean z = true;
        cxr.b = cursor.getString(1);
        if (cursor.getInt(2) != 1) {
            z = false;
        }
        cxr.c = z;
        cxr.d = cursor.getString(3);
        cxr.e = cursor.getInt(4);
        cxr.f = cursor.getString(5);
        String string = cursor.getString(6);
        cxr.g = string;
        if ("com.google.android.tvrecommendations".equals(string) && cursor.getBlob(7) != null) {
            byte[] blob = cursor.getBlob(7);
            String str = new String(blob, 0, blob.length - 1);
            if (!"sponsored.legacy".equals(str)) {
                cxr.g = str;
            }
        }
        return cxr;
    }

    public final String toString() {
        long j2 = this.a;
        String str = this.b;
        boolean z = this.c;
        String str2 = this.g;
        int i2 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 121 + String.valueOf(str2).length());
        sb.append("Channel{id=");
        sb.append(j2);
        sb.append(", displayName='");
        sb.append(str);
        sb.append("', browsable=");
        sb.append(z);
        sb.append(", packageName='");
        sb.append(str2);
        sb.append("', configurationDisplayOrder=");
        sb.append(i2);
        sb.append("'}");
        return sb.toString();
    }
}
