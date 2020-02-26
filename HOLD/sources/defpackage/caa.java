package defpackage;

import java.util.concurrent.Executor;

/* renamed from: caa  reason: default package */
/* compiled from: PG */
final /* synthetic */ class caa implements bzy {
    private final cac a;

    public caa(cac cac) {
        this.a = cac;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dgx.a(dgp, java.util.concurrent.Executor):dhb
     arg types: [cab, dhe]
     candidates:
      dgx.a(java.lang.Object, int):java.lang.Object
      dgx.a(java.lang.Object, java.lang.Object):java.lang.Object
      dgx.a(java.lang.String, java.lang.Object[]):java.lang.String
      dgx.a(int, int):void
      dgx.a(boolean, java.lang.Object):void
      dgx.a(dgp, java.util.concurrent.Executor):dhb */
    public final void a(int i, String str) {
        dhb dhb;
        cac cac = this.a;
        if (cac.b()) {
            dhb = dgx.a((dgp) new cab(cac, i, str), (Executor) cac.c());
        } else {
            dhb = dgy.a;
        }
        cev.a(dhb);
    }
}
