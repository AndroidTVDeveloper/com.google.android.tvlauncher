package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ed  reason: default package */
/* compiled from: PG */
public final class ed {
    public final AccessibilityNodeInfo a;

    public ed(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    public final void a(ea eaVar) {
        int i = Build.VERSION.SDK_INT;
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) eaVar.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ed)) {
            return false;
        }
        ed edVar = (ed) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo != null) {
            if (!accessibilityNodeInfo.equals(edVar.a)) {
                return false;
            }
        } else if (edVar.a != null) {
            return false;
        }
        return true;
    }

    private final List a(String str) {
        int i = Build.VERSION.SDK_INT;
        ArrayList<Integer> integerArrayList = this.a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private final Bundle b() {
        int i = Build.VERSION.SDK_INT;
        return this.a.getExtras();
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void a(int i, boolean z) {
        Bundle b = b();
        if (b != null) {
            int i2 = b.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ -1);
            if (!z) {
                i = 0;
            }
            b.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public final void a(Object obj) {
        Object obj2;
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (obj != null) {
            obj2 = ((ec) obj).a;
        } else {
            obj2 = null;
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) obj2);
    }

    public final void a() {
        this.a.setScrollable(true);
    }

    public final String toString() {
        CharSequence charSequence;
        List list;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.a.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        this.a.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.a.getPackageName());
        sb.append("; className: ");
        sb.append(this.a.getClassName());
        sb.append("; text: ");
        if (!(!a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            charSequence = this.a.getText();
        } else {
            List a2 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List a3 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List a4 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List a5 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
            for (int i = 0; i < a2.size(); i++) {
                spannableString.setSpan(new dz(((Integer) a5.get(i)).intValue(), this, b().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) a2.get(i)).intValue(), ((Integer) a3.get(i)).intValue(), ((Integer) a4.get(i)).intValue());
            }
            charSequence = spannableString;
        }
        sb.append(charSequence);
        sb.append("; contentDescription: ");
        sb.append(this.a.getContentDescription());
        sb.append("; viewId: ");
        int i2 = Build.VERSION.SDK_INT;
        sb.append(this.a.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.a.isFocused());
        sb.append("; selected: ");
        sb.append(this.a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.a.isEnabled());
        sb.append("; password: ");
        sb.append(this.a.isPassword());
        sb.append("; scrollable: " + this.a.isScrollable());
        sb.append("; [");
        int i3 = Build.VERSION.SDK_INT;
        int i4 = Build.VERSION.SDK_INT;
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.a.getActionList();
        if (actionList != null) {
            list = new ArrayList();
            int size = actionList.size();
            for (int i5 = 0; i5 < size; i5++) {
                list.add(new ea(actionList.get(i5)));
            }
        } else {
            list = Collections.emptyList();
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            ea eaVar = (ea) list.get(i6);
            int a6 = eaVar.a();
            if (a6 == 1) {
                str = "ACTION_FOCUS";
            } else if (a6 != 2) {
                switch (a6) {
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
                        switch (a6) {
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
                                switch (a6) {
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
            if (str.equals("ACTION_UNKNOWN") && eaVar.b() != null) {
                str = eaVar.b().toString();
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
