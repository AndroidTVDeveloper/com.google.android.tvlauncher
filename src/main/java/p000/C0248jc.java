package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.support.p002v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;

/* renamed from: jc */
/* compiled from: PG */
public final class C0248jc extends C0223ie {

    /* renamed from: c */
    public C0247jb f9685c;

    /* renamed from: d */
    private final int f9686d;

    /* renamed from: e */
    private final int f9687e;

    /* renamed from: f */
    private MenuItem f9688f;

    public C0248jc(Context context, boolean z) {
        super(context, z);
        Configuration configuration = context.getResources().getConfiguration();
        int i = Build.VERSION.SDK_INT;
        if (configuration.getLayoutDirection() == 1) {
            this.f9686d = 21;
            this.f9687e = 22;
            return;
        }
        this.f9686d = 22;
        this.f9687e = 21;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: fk} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onHoverEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            jb r0 = r8.f9685c
            if (r0 != 0) goto L_0x0006
            goto L_0x00c3
        L_0x0006:
            android.widget.ListAdapter r0 = r8.getAdapter()
            boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
            r2 = 0
            if (r1 == 0) goto L_0x001c
            android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
            int r1 = r0.getHeadersCount()
            android.widget.ListAdapter r0 = r0.getWrappedAdapter()
            fm r0 = (p000.C0150fm) r0
            goto L_0x0020
        L_0x001c:
            fm r0 = (p000.C0150fm) r0
            r1 = 0
        L_0x0020:
            int r3 = r9.getAction()
            r4 = 10
            r5 = -1
            r6 = 0
            if (r3 == r4) goto L_0x0049
            float r3 = r9.getX()
            int r3 = (int) r3
            float r4 = r9.getY()
            int r4 = (int) r4
            int r3 = r8.pointToPosition(r3, r4)
            if (r3 == r5) goto L_0x0049
            int r3 = r3 - r1
            if (r3 < 0) goto L_0x0049
            int r1 = r0.getCount()
            if (r3 >= r1) goto L_0x0048
            fp r1 = r0.getItem(r3)
            goto L_0x004a
        L_0x0048:
        L_0x0049:
            r1 = r6
        L_0x004a:
            android.view.MenuItem r3 = r8.f9688f
            if (r3 == r1) goto L_0x00c3
            fo r0 = r0.f9296a
            if (r3 == 0) goto L_0x0063
            jb r3 = r8.f9685c
            jd r3 = (p000.C0249jd) r3
            jb r3 = r3.f9690p
            if (r3 == 0) goto L_0x0063
            fj r3 = (p000.C0147fj) r3
            fl r3 = r3.f9267a
            android.os.Handler r3 = r3.f9271a
            r3.removeCallbacksAndMessages(r0)
        L_0x0063:
            r8.f9688f = r1
            if (r1 == 0) goto L_0x00c3
            jb r3 = r8.f9685c
            jd r3 = (p000.C0249jd) r3
            jb r3 = r3.f9690p
            if (r3 == 0) goto L_0x00c3
            fj r3 = (p000.C0147fj) r3
            fl r4 = r3.f9267a
            android.os.Handler r4 = r4.f9271a
            r4.removeCallbacksAndMessages(r6)
            fl r4 = r3.f9267a
            java.util.List r4 = r4.f9272b
            int r4 = r4.size()
        L_0x0080:
            if (r2 >= r4) goto L_0x0093
            fl r7 = r3.f9267a
            java.util.List r7 = r7.f9272b
            java.lang.Object r7 = r7.get(r2)
            fk r7 = (p000.C0148fk) r7
            fo r7 = r7.f9269b
            if (r0 == r7) goto L_0x0095
            int r2 = r2 + 1
            goto L_0x0080
        L_0x0093:
            r2 = -1
        L_0x0095:
            if (r2 == r5) goto L_0x00c3
            int r2 = r2 + 1
            fl r4 = r3.f9267a
            java.util.List r4 = r4.f9272b
            int r4 = r4.size()
            if (r2 < r4) goto L_0x00a4
            goto L_0x00af
        L_0x00a4:
            fl r4 = r3.f9267a
            java.util.List r4 = r4.f9272b
            java.lang.Object r2 = r4.get(r2)
            r6 = r2
            fk r6 = (p000.C0148fk) r6
        L_0x00af:
            fi r2 = new fi
            r2.<init>(r3, r6, r1, r0)
            long r4 = android.os.SystemClock.uptimeMillis()
            fl r1 = r3.f9267a
            android.os.Handler r1 = r1.f9271a
            r6 = 200(0xc8, double:9.9E-322)
            long r4 = r4 + r6
            r1.postAtTime(r2, r0, r4)
        L_0x00c3:
            boolean r9 = super.onHoverEvent(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0248jc.onHoverEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f9686d) {
            if (listMenuItemView.isEnabled() && listMenuItemView.f962a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.f9687e) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ((C0150fm) getAdapter()).f9296a.mo4863a(false);
            return true;
        }
    }
}
