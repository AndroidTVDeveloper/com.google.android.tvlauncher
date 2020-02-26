package defpackage;

import android.media.tv.TvInputInfo;
import android.media.tv.TvInputManager;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: cwd  reason: default package */
/* compiled from: PG */
final class cwd extends Handler {
    private final WeakReference a;

    public cwd(cwe cwe) {
        this.a = new WeakReference(cwe);
    }

    public final void handleMessage(Message message) {
        TvInputInfo tvInputInfo;
        TvInputInfo tvInputInfo2;
        cwe cwe = (cwe) this.a.get();
        if (cwe != null) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (!cwe.e()) {
                                TvInputInfo tvInputInfo3 = (TvInputInfo) message.obj;
                                if (!tvInputInfo3.isHidden(cwe.b)) {
                                    CharSequence loadCustomLabel = tvInputInfo3.loadCustomLabel(cwe.b);
                                    if (loadCustomLabel != null) {
                                        String id = tvInputInfo3.getId();
                                        cwg cwg = (cwg) cwe.j.get(id);
                                        if (cwg != null) {
                                            cwg.h = loadCustomLabel.toString();
                                            if (cwe.a(id) >= 0) {
                                                cwe.f();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                cwe.a();
                                return;
                            }
                            cwe.a();
                        }
                    } else if (!cwe.e()) {
                        String str = (String) message.obj;
                        cwg cwg2 = (cwg) cwe.j.get(str);
                        if (cwg2 == null || (tvInputInfo2 = cwg2.c) == null || !tvInputInfo2.isPassthroughInput()) {
                            cwe.b(str);
                            cwe.h.remove(str);
                            cwe.g.remove(str);
                            if (!cwe.h.isEmpty()) {
                                return;
                            }
                            if ((cwe.g.isEmpty() || cwe.d) && cwe.k) {
                                boolean z = false;
                                cwe.k = false;
                                for (int size = cwe.i.size() - 1; size >= 0; size--) {
                                    if (((cwg) cwe.i.get(size)).d == -3) {
                                        cwe.i.remove(size);
                                        z = true;
                                    }
                                }
                                if (z) {
                                    cwe.f();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        cwe.b(str);
                    } else {
                        cwe.a();
                    }
                } else if (!cwe.e()) {
                    String str2 = (String) message.obj;
                    TvInputManager tvInputManager = cwe.a;
                    if (tvInputManager != null && (tvInputInfo = tvInputManager.getTvInputInfo(str2)) != null) {
                        if (tvInputInfo.isPassthroughInput()) {
                            cwe.a(tvInputInfo);
                        } else if (cwe.a(cwe.b.getPackageManager(), tvInputInfo)) {
                            cwe.g.put(tvInputInfo.getId(), tvInputInfo);
                            if (cwe.d) {
                                cwe.a(tvInputInfo);
                            } else if (!tvInputInfo.isHidden(cwe.b)) {
                                cwe.g();
                            }
                        } else {
                            cwe.h.put(tvInputInfo.getId(), tvInputInfo);
                            if (!tvInputInfo.isHidden(cwe.b)) {
                                cwe.g();
                            }
                        }
                    }
                } else {
                    cwe.a();
                }
            } else if (!cwe.e()) {
                String str3 = (String) message.obj;
                int i2 = message.arg1;
                cwg cwg3 = (cwg) cwe.j.get(str3);
                if (cwg3 != null) {
                    cwg3.g = i2;
                    if (cwe.a(str3) >= 0) {
                        cwe.f();
                    }
                }
            } else {
                cwe.a();
            }
        }
    }
}
