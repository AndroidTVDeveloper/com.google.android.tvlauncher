package p000;

/* renamed from: cxt */
/* compiled from: PG */
public final class cxt {

    /* renamed from: l */
    public static final String[] f7873l = {"_id", "display_name", "app_link_intent_uri", "system_channel_key", "logo_content_description", "package_name", "subtype", "internal_provider_data"};

    /* renamed from: a */
    public long f7874a;

    /* renamed from: b */
    public String f7875b;

    /* renamed from: c */
    public String f7876c;

    /* renamed from: d */
    public String f7877d;

    /* renamed from: e */
    public String f7878e;

    /* renamed from: f */
    public String f7879f;

    /* renamed from: g */
    public boolean f7880g;

    /* renamed from: h */
    public int f7881h;

    /* renamed from: i */
    public boolean f7882i = true;

    /* renamed from: j */
    public boolean f7883j = true;

    /* renamed from: k */
    public boolean f7884k = false;

    public final int hashCode() {
        return (int) this.f7874a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cxt) && this.f7874a == ((cxt) obj).f7874a;
    }

    public final String toString() {
        long j = this.f7874a;
        String str = this.f7875b;
        String str2 = this.f7879f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("HomeChannel{id=");
        sb.append(j);
        sb.append(", displayName='");
        sb.append(str);
        sb.append("', packageName='");
        sb.append(str2);
        sb.append("'}");
        return sb.toString();
    }
}
