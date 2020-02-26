package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: fo  reason: default package */
/* compiled from: PG */
public class fo implements bs {
    private static final int[] h = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final ArrayList b;
    public boolean c;
    public final ArrayList d;
    public CharSequence e;
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public fp g;
    private final Resources i;
    private boolean j;
    private final boolean k;
    private final ArrayList l;
    private final ArrayList m;
    private boolean n;
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private boolean r = false;
    private final ArrayList s = new ArrayList();
    private boolean t = false;

    public boolean a() {
        return this.t;
    }

    public boolean a(fo foVar, MenuItem menuItem) {
        return false;
    }

    public boolean b() {
        return this.j;
    }

    public boolean c() {
        return this.k;
    }

    public fo i() {
        return this;
    }

    public void k() {
    }

    public fo(Context context) {
        boolean z = false;
        this.a = context;
        this.i = context.getResources();
        this.b = new ArrayList();
        this.l = new ArrayList();
        this.c = true;
        this.d = new ArrayList();
        this.m = new ArrayList();
        this.n = true;
        if (this.i.getConfiguration().keyboard != 1 && dy.a(ViewConfiguration.get(this.a), this.a)) {
            z = true;
        }
        this.k = z;
    }

    public final MenuItem add(int i2) {
        return a(0, 0, 0, this.i.getString(i2));
    }

    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.i.getString(i5));
    }

    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            Intent intent2 = new Intent(resolveInfo.specificIndex >= 0 ? intentArr[resolveInfo.specificIndex] : intent);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = a(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    private final MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = i4 >> 16;
        if (i6 >= 0) {
            int[] iArr = h;
            if (i6 < iArr.length) {
                char c2 = (iArr[i6] << 16) | ((char) i4);
                fp fpVar = new fp(this, i2, i3, i4, c2, charSequence);
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        i5 = 0;
                        break;
                    } else if (((fp) arrayList.get(size)).c <= c2) {
                        i5 = size + 1;
                        break;
                    }
                }
                arrayList.add(i5, fpVar);
                b(true);
                return fpVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public final void a(fv fvVar, Context context) {
        this.f.add(new WeakReference(fvVar));
        fvVar.a(context, this);
        this.n = true;
    }

    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.i.getString(i2));
    }

    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.i.getString(i5));
    }

    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        fp fpVar = (fp) a(i2, i3, i4, charSequence);
        gc gcVar = new gc(this.a, this, fpVar);
        fpVar.a(gcVar);
        return gcVar;
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void clear() {
        fp fpVar = this.g;
        if (fpVar != null) {
            b(fpVar);
        }
        this.b.clear();
        b(true);
    }

    public final void clearHeader() {
        this.e = null;
        b(false);
    }

    public final void close() {
        a(true);
    }

    public final void a(boolean z) {
        if (!this.r) {
            this.r = true;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                fv fvVar = (fv) weakReference.get();
                if (fvVar == null) {
                    this.f.remove(weakReference);
                } else {
                    fvVar.a(this, z);
                }
            }
            this.r = false;
        }
    }

    public boolean b(fp fpVar) {
        boolean z = false;
        if (!this.f.isEmpty() && this.g == fpVar) {
            d();
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                fv fvVar = (fv) weakReference.get();
                if (fvVar == null) {
                    this.f.remove(weakReference);
                } else {
                    z = fvVar.a(fpVar);
                    if (z) {
                        break;
                    }
                }
            }
            e();
            if (z) {
                this.g = null;
            }
        }
        return z;
    }

    public boolean a(fp fpVar) {
        boolean z = false;
        if (!this.f.isEmpty()) {
            d();
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                fv fvVar = (fv) weakReference.get();
                if (fvVar == null) {
                    this.f.remove(weakReference);
                } else {
                    z = fvVar.b(fpVar);
                    if (z) {
                        break;
                    }
                }
            }
            e();
            if (z) {
                this.g = fpVar;
            }
        }
        return z;
    }

    public final MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            fp fpVar = (fp) this.b.get(i3);
            if (fpVar.a == i2) {
                return fpVar;
            }
            if (fpVar.hasSubMenu() && (findItem = fpVar.j.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    private final fp a(int i2, KeyEvent keyEvent) {
        char c2;
        ArrayList arrayList = this.s;
        arrayList.clear();
        a(arrayList, i2, keyEvent);
        if (!arrayList.isEmpty()) {
            int metaState = keyEvent.getMetaState();
            KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
            keyEvent.getKeyData(keyData);
            int size = arrayList.size();
            if (size == 1) {
                return (fp) arrayList.get(0);
            }
            boolean b2 = b();
            for (int i3 = 0; i3 < size; i3++) {
                fp fpVar = (fp) arrayList.get(i3);
                if (!b2) {
                    c2 = fpVar.e;
                } else {
                    c2 = fpVar.g;
                }
                if ((c2 == keyData.meta[0] && (metaState & 2) == 0) || ((c2 == keyData.meta[2] && (metaState & 2) != 0) || (b2 && c2 == 8 && i2 == 67))) {
                    return fpVar;
                }
            }
        }
        return null;
    }

    private final void a(List list, int i2, KeyEvent keyEvent) {
        char c2;
        int i3;
        boolean b2 = b();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.b.size();
            for (int i4 = 0; i4 < size; i4++) {
                fp fpVar = (fp) this.b.get(i4);
                if (fpVar.hasSubMenu()) {
                    fpVar.j.a(list, i2, keyEvent);
                }
                if (!b2) {
                    c2 = fpVar.e;
                } else {
                    c2 = fpVar.g;
                }
                if (!b2) {
                    i3 = fpVar.f;
                } else {
                    i3 = fpVar.h;
                }
                if ((modifiers & 69647) == (i3 & 69647) && c2 != 0 && ((c2 == keyData.meta[0] || c2 == keyData.meta[2] || (b2 && c2 == 8 && i2 == 67)) && fpVar.isEnabled())) {
                    list.add(fpVar);
                }
            }
        }
    }

    public final void g() {
        ArrayList f2 = f();
        if (this.n) {
            Iterator it = this.f.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                fv fvVar = (fv) weakReference.get();
                if (fvVar == null) {
                    this.f.remove(weakReference);
                } else {
                    z |= fvVar.a();
                }
            }
            if (!z) {
                this.d.clear();
                this.m.clear();
                this.m.addAll(f());
            } else {
                this.d.clear();
                this.m.clear();
                int size = f2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    fp fpVar = (fp) f2.get(i2);
                    if (fpVar.e()) {
                        this.d.add(fpVar);
                    } else {
                        this.m.add(fpVar);
                    }
                }
            }
            this.n = false;
        }
    }

    public final MenuItem getItem(int i2) {
        return (MenuItem) this.b.get(i2);
    }

    public final ArrayList h() {
        g();
        return this.m;
    }

    public final ArrayList f() {
        if (this.c) {
            this.l.clear();
            int size = this.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                fp fpVar = (fp) this.b.get(i2);
                if (fpVar.isVisible()) {
                    this.l.add(fpVar);
                }
            }
            this.c = false;
            this.n = true;
        }
        return this.l;
    }

    public final boolean hasVisibleItems() {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((fp) this.b.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return a(i2, keyEvent) != null;
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        this.n = true;
        b(true);
    }

    public final void b(boolean z) {
        if (this.o) {
            this.p = true;
            if (z) {
                this.q = true;
                return;
            }
            return;
        }
        if (z) {
            this.c = true;
            this.n = true;
        }
        if (!this.f.isEmpty()) {
            d();
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                fv fvVar = (fv) weakReference.get();
                if (fvVar == null) {
                    this.f.remove(weakReference);
                } else {
                    fvVar.b();
                }
            }
            e();
        }
    }

    public final boolean performIdentifierAction(int i2, int i3) {
        return a(findItem(i2), i3);
    }

    public final boolean a(MenuItem menuItem, int i2) {
        return a(menuItem, (fv) null, i2);
    }

    public final boolean a(MenuItem menuItem, fv fvVar, int i2) {
        boolean z;
        fp fpVar = (fp) menuItem;
        if (fpVar == null || !fpVar.isEnabled()) {
            return false;
        }
        boolean a2 = fpVar.a();
        if (fpVar.o == null) {
            if (fpVar.h()) {
                a2 |= fpVar.expandActionView();
                if (a2) {
                    a(true);
                    return true;
                }
            } else if (fpVar.hasSubMenu()) {
                if ((i2 & 4) == 0) {
                    a(false);
                }
                if (!fpVar.hasSubMenu()) {
                    fpVar.a(new gc(this.a, this, fpVar));
                }
                gc gcVar = fpVar.j;
                if (this.f.isEmpty()) {
                    z = false;
                } else {
                    z = fvVar != null ? fvVar.a(gcVar) : false;
                    Iterator it = this.f.iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        fv fvVar2 = (fv) weakReference.get();
                        if (fvVar2 == null) {
                            this.f.remove(weakReference);
                        } else if (!z) {
                            z = fvVar2.a(gcVar);
                        }
                    }
                }
                a2 |= z;
                if (!a2) {
                    a(true);
                    return false;
                }
            } else if ((i2 & 1) == 0) {
                a(true);
                return a2;
            }
            return a2;
        }
        throw null;
    }

    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        boolean z;
        fp a2 = a(i2, keyEvent);
        if (a2 != null) {
            z = a(a2, i3);
        } else {
            z = false;
        }
        if ((i3 & 2) != 0) {
            a(true);
        }
        return z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: fo.a(int, boolean):void
     arg types: [int, int]
     candidates:
      fo.a(int, android.view.KeyEvent):fp
      fo.a(fv, android.content.Context):void
      fo.a(android.view.MenuItem, int):boolean
      fo.a(fo, android.view.MenuItem):boolean
      fo.a(int, boolean):void */
    public final void removeGroup(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                if (((fp) this.b.get(i3)).b == i2) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 >= 0) {
            int size2 = this.b.size() - i3;
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= size2 || ((fp) this.b.get(i3)).b != i2) {
                    b(true);
                } else {
                    a(i3, false);
                    i4 = i5;
                }
            }
            b(true);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: fo.a(int, boolean):void
     arg types: [int, int]
     candidates:
      fo.a(int, android.view.KeyEvent):fp
      fo.a(fv, android.content.Context):void
      fo.a(android.view.MenuItem, int):boolean
      fo.a(fo, android.view.MenuItem):boolean
      fo.a(int, boolean):void */
    public final void removeItem(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                if (((fp) this.b.get(i3)).a == i2) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        a(i3, true);
    }

    private final void a(int i2, boolean z) {
        if (i2 >= 0 && i2 < this.b.size()) {
            this.b.remove(i2);
            if (z) {
                b(true);
            }
        }
    }

    public final void setGroupCheckable(int i2, boolean z, boolean z2) {
        int size = this.b.size();
        for (int i3 = 0; i3 < size; i3++) {
            fp fpVar = (fp) this.b.get(i3);
            if (fpVar.b == i2) {
                fpVar.a(z2);
                fpVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.t = z;
    }

    public final void setGroupEnabled(int i2, boolean z) {
        int size = this.b.size();
        for (int i3 = 0; i3 < size; i3++) {
            fp fpVar = (fp) this.b.get(i3);
            if (fpVar.b == i2) {
                fpVar.setEnabled(z);
            }
        }
    }

    public final void setGroupVisible(int i2, boolean z) {
        int size = this.b.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            fp fpVar = (fp) this.b.get(i3);
            if (fpVar.b == i2 && fpVar.b(z)) {
                z2 = true;
            }
        }
        if (z2) {
            b(true);
        }
    }

    public final void a(int i2, CharSequence charSequence, int i3, View view) {
        Resources resources = this.i;
        if (view != null) {
            this.e = null;
        } else {
            if (i2 > 0) {
                this.e = resources.getText(i2);
            } else if (charSequence != null) {
                this.e = charSequence;
            }
            if (i3 > 0) {
                bg.a(this.a, i3);
            }
        }
        b(false);
    }

    public void setQwertyMode(boolean z) {
        this.j = z;
        b(false);
    }

    public final int size() {
        return this.b.size();
    }

    public final void e() {
        this.o = false;
        if (this.p) {
            this.p = false;
            b(this.q);
        }
    }

    public final void d() {
        if (!this.o) {
            this.o = true;
            this.p = false;
            this.q = false;
        }
    }
}
