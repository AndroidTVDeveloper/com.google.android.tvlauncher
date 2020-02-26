package p000;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ed */
/* compiled from: PG */
public final class C0114ed {

    /* renamed from: a */
    public final AccessibilityNodeInfo f9123a;

    public C0114ed(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f9123a = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public final void mo4699a(C0111ea eaVar) {
        int i = Build.VERSION.SDK_INT;
        this.f9123a.addAction((AccessibilityNodeInfo.AccessibilityAction) eaVar.f9120g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0114ed)) {
            return false;
        }
        C0114ed edVar = (C0114ed) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f9123a;
        if (accessibilityNodeInfo != null) {
            if (!accessibilityNodeInfo.equals(edVar.f9123a)) {
                return false;
            }
        } else if (edVar.f9123a != null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final List m7231a(String str) {
        int i = Build.VERSION.SDK_INT;
        ArrayList<Integer> integerArrayList = this.f9123a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f9123a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: b */
    private final Bundle m7232b() {
        int i = Build.VERSION.SDK_INT;
        return this.f9123a.getExtras();
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f9123a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: a */
    public final void mo4698a(int i, boolean z) {
        Bundle b = m7232b();
        if (b != null) {
            int i2 = b.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ -1);
            if (!z) {
                i = 0;
            }
            b.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: a */
    public final void mo4700a(Object obj) {
        Object obj2;
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f9123a;
        if (obj != null) {
            obj2 = ((C0113ec) obj).f9122a;
        } else {
            obj2 = null;
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) obj2);
    }

    /* renamed from: a */
    public final void mo4697a() {
        this.f9123a.setScrollable(true);
    }

    public final String toString() {
        CharSequence charSequence;
        List list;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.f9123a.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        this.f9123a.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.f9123a.getPackageName());
        sb.append("; className: ");
        sb.append(this.f9123a.getClassName());
        sb.append("; text: ");
        if (!(!m7231a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            charSequence = this.f9123a.getText();
        } else {
            List a = m7231a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List a2 = m7231a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List a3 = m7231a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List a4 = m7231a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f9123a.getText(), 0, this.f9123a.getText().length()));
            for (int i = 0; i < a.size(); i++) {
                spannableString.setSpan(new C0109dz(((Integer) a4.get(i)).intValue(), this, m7232b().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) a.get(i)).intValue(), ((Integer) a2.get(i)).intValue(), ((Integer) a3.get(i)).intValue());
            }
            charSequence = spannableString;
        }
        sb.append(charSequence);
        sb.append("; contentDescription: ");
        sb.append(this.f9123a.getContentDescription());
        sb.append("; viewId: ");
        int i2 = Build.VERSION.SDK_INT;
        sb.append(this.f9123a.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.f9123a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f9123a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f9123a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f9123a.isFocused());
        sb.append("; selected: ");
        sb.append(this.f9123a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f9123a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f9123a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f9123a.isEnabled());
        sb.append("; password: ");
        sb.append(this.f9123a.isPassword());
        sb.append("; scrollable: " + this.f9123a.isScrollable());
        sb.append("; [");
        int i3 = Build.VERSION.SDK_INT;
        int i4 = Build.VERSION.SDK_INT;
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f9123a.getActionList();
        if (actionList != null) {
            list = new ArrayList();
            int size = actionList.size();
            for (int i5 = 0; i5 < size; i5++) {
                list.add(new C0111ea(actionList.get(i5)));
            }
        } else {
            list = Collections.emptyList();
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            C0111ea eaVar = (C0111ea) list.get(i6);
            int a5 = eaVar.mo4693a();
            if (a5 == 1) {
                str = "ACTION_FOCUS";
            } else if (a5 != 2) {
                switch (a5) {
                    case 4:
                        str = "ACTION_SELECT";
                        break;
                    case 8:
                        str = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        str = "ACTION_CLICK";
                        break;
                    case 32:
                        str = "ACTION_LONG_CLICK";
                        break;
                    case 64:
                        str = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case 128:
                        str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case 256:
                        str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 512:
                        str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 1024:
                        str = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case 2048:
                        str = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case 4096:
                        str = "ACTION_SCROLL_FORWARD";
                        break;
                    case 8192:
                        str = "ACTION_SCROLL_BACKWARD";
                        break;
                    case 16384:
                        str = "ACTION_COPY";
                        break;
                    case 32768:
                        str = "ACTION_PASTE";
                        break;
                    case 65536:
                        str = "ACTION_CUT";
                        break;
                    case 131072:
                        str = "ACTION_SET_SELECTION";
                        break;
                    case 262144:
                        str = "ACTION_EXPAND";
                        break;
                    case 524288:
                        str = "ACTION_COLLAPSE";
                        break;
                    case 2097152:
                        str = "ACTION_SET_TEXT";
                        break;
                    case 16908354:
                        str = "ACTION_MOVE_WINDOW";
                        break;
                    default:
                        switch (a5) {
                            case 16908342:
                                str = "ACTION_SHOW_ON_SCREEN";
                                break;
                            case 16908343:
                                str = "ACTION_SCROLL_TO_POSITION";
                                break;
                            case 16908344:
                                str = "ACTION_SCROLL_UP";
                                break;
                            case 16908345:
                                str = "ACTION_SCROLL_LEFT";
                                break;
                            case 16908346:
                                str = "ACTION_SCROLL_DOWN";
                                break;
                            case 16908347:
                                str = "ACTION_SCROLL_RIGHT";
                                break;
                            case 16908348:
                                str = "ACTION_CONTEXT_CLICK";
                                break;
                            case 16908349:
                                str = "ACTION_SET_PROGRESS";
                                break;
                            default:
                                switch (a5) {
                                    case 16908356:
                                        str = "ACTION_SHOW_TOOLTIP";
                                        break;
                                    case 16908357:
                                        str = "ACTION_HIDE_TOOLTIP";
                                        break;
                                    case 16908358:
                                        str = "ACTION_PAGE_UP";
                                        break;
                                    case 16908359:
                                        str = "ACTION_PAGE_DOWN";
                                        break;
                                    case 16908360:
                                        str = "ACTION_PAGE_LEFT";
                                        break;
                                    case 16908361:
                                        str = "ACTION_PAGE_RIGHT";
                                        break;
                                    default:
                                        str = "ACTION_UNKNOWN";
                                        break;
                                }
                        }
                }
            } else {
                str = "ACTION_CLEAR_FOCUS";
            }
            if (str.equals("ACTION_UNKNOWN") && eaVar.mo4694b() != null) {
                str = eaVar.mo4694b().toString();
            }
            sb.append(str);
            if (i6 != list.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
