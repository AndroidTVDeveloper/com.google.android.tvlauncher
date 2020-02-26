package p000;

import java.util.concurrent.Executor;

/* renamed from: caa */
/* compiled from: PG */
final /* synthetic */ class caa implements bzy {

    /* renamed from: a */
    private final cac f5098a;

    public caa(cac cac) {
        this.f5098a = cac;
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
    /* renamed from: a */
    public final void mo2593a(int i, String str) {
        dhb dhb;
        cac cac = this.f5098a;
        if (cac.mo2547b()) {
            dhb = dgx.m6400a((dgp) new cab(cac, i, str), (Executor) cac.mo2548c());
        } else {
            dhb = dgy.f8518a;
        }
        cev.m4630a(dhb);
    }
}
