package defpackage;

/* renamed from: cxt  reason: default package */
/* compiled from: PG */
public final class cxt {
    public static final String[] l = {"_id", "display_name", "app_link_intent_uri", "system_channel_key", "logo_content_description", "package_name", "subtype", "internal_provider_data"};
    public long a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public int h;
    public boolean i = true;
    public boolean j = true;
    public boolean k = false;

    public final int hashCode() {
        return (int) this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cxt) && this.a == ((cxt) obj).a;
    }

    public final String toString() {
        long j2 = this.a;
        String str = this.b;
        String str2 = this.f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("HomeChannel{id=");
        sb.append(j2);
        sb.append(", displayName='");
        sb.append(str);
        sb.append("', packageName='");
        sb.append(str2);
        sb.append("'}");
        return sb.toString();
    }
}
