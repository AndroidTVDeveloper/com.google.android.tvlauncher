package p000;

/* renamed from: dew */
/* compiled from: PG */
final class dew {

    /* renamed from: a */
    public C0285km f8415a;

    /* renamed from: b */
    public C0285km f8416b;

    /* renamed from: c */
    public final int f8417c;

    /* renamed from: d */
    public final int f8418d;

    /* renamed from: e */
    public final int f8419e;

    /* renamed from: f */
    public final int f8420f;

    public dew(C0285km kmVar, C0285km kmVar2, int i, int i2, int i3, int i4) {
        this.f8415a = kmVar;
        this.f8416b = kmVar2;
        this.f8417c = i;
        this.f8418d = i2;
        this.f8419e = i3;
        this.f8420f = i4;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8415a);
        String valueOf2 = String.valueOf(this.f8416b);
        int i = this.f8417c;
        int i2 = this.f8418d;
        int i3 = this.f8419e;
        int i4 = this.f8420f;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 106 + String.valueOf(valueOf2).length());
        sb.append("ChangeInfo{oldHolder=");
        sb.append(valueOf);
        sb.append(", newHolder=");
        sb.append(valueOf2);
        sb.append(", fromX=");
        sb.append(i);
        sb.append(", fromY=");
        sb.append(i2);
        sb.append(", toX=");
        sb.append(i3);
        sb.append(", toY=");
        sb.append(i4);
        sb.append('}');
        return sb.toString();
    }
}
