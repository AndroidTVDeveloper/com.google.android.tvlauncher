package p000;

import android.media.tv.TvInputInfo;
import android.media.tv.TvInputManager;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: cwd */
/* compiled from: PG */
final class cwd extends Handler {

    /* renamed from: a */
    private final WeakReference f7726a;

    public cwd(cwe cwe) {
        this.f7726a = new WeakReference(cwe);
    }

    public final void handleMessage(Message message) {
        TvInputInfo tvInputInfo;
        TvInputInfo tvInputInfo2;
        cwe cwe = (cwe) this.f7726a.get();
        if (cwe != null) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (!cwe.mo3864e()) {
                                TvInputInfo tvInputInfo3 = (TvInputInfo) message.obj;
                                if (!tvInputInfo3.isHidden(cwe.f7731b)) {
                                    CharSequence loadCustomLabel = tvInputInfo3.loadCustomLabel(cwe.f7731b);
                                    if (loadCustomLabel != null) {
                                        String id = tvInputInfo3.getId();
                                        cwg cwg = (cwg) cwe.f7739j.get(id);
                                        if (cwg != null) {
                                            cwg.f7756h = loadCustomLabel.toString();
                                            if (cwe.mo3860a(id) >= 0) {
                                                cwe.mo3865f();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                cwe.mo3861a();
                                return;
                            }
                            cwe.mo3861a();
                        }
                    } else if (!cwe.mo3864e()) {
                        String str = (String) message.obj;
                        cwg cwg2 = (cwg) cwe.f7739j.get(str);
                        if (cwg2 == null || (tvInputInfo2 = cwg2.f7751c) == null || !tvInputInfo2.isPassthroughInput()) {
                            cwe.mo3863b(str);
                            cwe.f7737h.remove(str);
                            cwe.f7736g.remove(str);
                            if (!cwe.f7737h.isEmpty()) {
                                return;
                            }
                            if ((cwe.f7736g.isEmpty() || cwe.f7733d) && cwe.f7740k) {
                                boolean z = false;
                                cwe.f7740k = false;
                                for (int size = cwe.f7738i.size() - 1; size >= 0; size--) {
                                    if (((cwg) cwe.f7738i.get(size)).f7752d == -3) {
                                        cwe.f7738i.remove(size);
                                        z = true;
                                    }
                                }
                                if (z) {
                                    cwe.mo3865f();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        cwe.mo3863b(str);
                    } else {
                        cwe.mo3861a();
                    }
                } else if (!cwe.mo3864e()) {
                    String str2 = (String) message.obj;
                    TvInputManager tvInputManager = cwe.f7730a;
                    if (tvInputManager != null && (tvInputInfo = tvInputManager.getTvInputInfo(str2)) != null) {
                        if (tvInputInfo.isPassthroughInput()) {
                            cwe.mo3862a(tvInputInfo);
                        } else if (cwe.m5772a(cwe.f7731b.getPackageManager(), tvInputInfo)) {
                            cwe.f7736g.put(tvInputInfo.getId(), tvInputInfo);
                            if (cwe.f7733d) {
                                cwe.mo3862a(tvInputInfo);
                            } else if (!tvInputInfo.isHidden(cwe.f7731b)) {
                                cwe.mo3866g();
                            }
                        } else {
                            cwe.f7737h.put(tvInputInfo.getId(), tvInputInfo);
                            if (!tvInputInfo.isHidden(cwe.f7731b)) {
                                cwe.mo3866g();
                            }
                        }
                    }
                } else {
                    cwe.mo3861a();
                }
            } else if (!cwe.mo3864e()) {
                String str3 = (String) message.obj;
                int i2 = message.arg1;
                cwg cwg3 = (cwg) cwe.f7739j.get(str3);
                if (cwg3 != null) {
                    cwg3.f7755g = i2;
                    if (cwe.mo3860a(str3) >= 0) {
                        cwe.mo3865f();
                    }
                }
            } else {
                cwe.mo3861a();
            }
        }
    }
}
