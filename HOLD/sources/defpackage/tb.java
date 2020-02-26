package defpackage;

import java.io.IOException;

/* renamed from: tb  reason: default package */
/* compiled from: PG */
public final class tb {
    public final tc a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ te d;

    public /* synthetic */ tb(te teVar, tc tcVar) {
        this.d = teVar;
        this.a = tcVar;
        this.b = !tcVar.d ? new boolean[teVar.d] : null;
    }

    public final void a() {
        this.d.a(this, false);
    }

    public final void b() {
        if (!this.c) {
            try {
                a();
            } catch (IOException e) {
            }
        }
    }
}
