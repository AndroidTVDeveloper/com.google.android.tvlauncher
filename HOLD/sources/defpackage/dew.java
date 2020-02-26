package defpackage;

/* renamed from: dew  reason: default package */
/* compiled from: PG */
final class dew {
    public km a;
    public km b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public dew(km kmVar, km kmVar2, int i, int i2, int i3, int i4) {
        this.a = kmVar;
        this.b = kmVar2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        int i2 = this.d;
        int i3 = this.e;
        int i4 = this.f;
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
