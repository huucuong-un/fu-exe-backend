package com.exe01.backend.constant;

public class ConstAPI {
    public static class AuthenticationAPI {
        public static final String LOGIN_WITH_PASSWORD_USERNAME = "api/v1/auth/login";
        public static final String TEST_AWS_DEPLOY = "api/v1/test-aws-deploy";
        public static final String TEST_AWS_DEPLOY2 = "api/v1/test-aws-deploy2";

    }

    public static class RoleAPI {
        public static final String GET_ROLE = "api/v1/role";
        public static final String GET_ROLE_STATUS_TRUE = "api/v1/role/role-status-true";
        public static final String GET_ROLE_BY_ID = "api/v1/role/";
        public static final String CREATE_ROLE = "api/v1/role/create";
        public static final String UPDATE_ROLE = "api/v1/role/update/";
    }

    public static class AccountAPI {
        public static final String GET_ACCOUNT = "api/v1/account";
        public static final String GET_ACCOUNT_STATUS_TRUE = "api/v1/account/account-status-true";
        public static final String GET_ACCOUNT_BY_ID = "api/v1/account/";
        public static final String CREATE_ACCOUNT = "api/v1/account/create";
        public static final String UPDATE_ACCOUNT = "api/v1/account/update/";
        public static final String DELETE_ACCOUNT = "api/v1/account/delete/";
    }

    public static class MajorAPI {
        public static final String GET_MAJOR = "api/v1/major";
        public static final String GET_MAJOR_STATUS_TRUE = "api/v1/major/major-status-true";
        public static final String GET_MAJOR_BY_ID = "api/v1/major/";
        public static final String CREATE_MAJOR = "api/v1/major/create";
        public static final String UPDATE_MAJOR = "api/v1/major/update/";
        public static final String DELETE_MAJOR = "api/v1/major/delete/";
    }

    public static class MentorProfileAPI {
        public static final String GET_MENTOR_PROFILE = "api/v1/mentor-profile";
        public static final String GET_MENTOR_PROFILE_STATUS_TRUE = "api/v1/mentor-profile/mentor-profile-status-true";
        public static final String GET_MENTOR_PROFILE_BY_ID = "api/v1/mentor-profile/";
        public static final String CREATE_MENTOR_PROFILE = "api/v1/mentor-profile/create";
        public static final String UPDATE_MENTOR_PROFILE = "api/v1/mentor-profile/update/";
        public static final String DELETE_MENTOR_PROFILE = "api/v1/mentor-profile/delete/";
    }

    public static class MentorAPI {
        public static final String GET_MENTOR = "api/v1/mentor";
        public static final String GET_MENTOR_STATUS_TRUE = "api/v1/mentor/mentor-status-true";
        public static final String GET_MENTOR_BY_ID = "api/v1/mentor/";
        public static final String CREATE_MENTOR = "api/v1/mentor/create";
        public static final String UPDATE_MENTOR = "api/v1/mentor/update/";
        public static final String DELETE_MENTOR = "api/v1/mentor/delete/";
    }

    public static class StudentAPI {
        public static final String GET_STUDENT = "api/v1/student";
        public static final String GET_STUDENT_STATUS_TRUE = "api/v1/student/student-status-true";
        public static final String GET_STUDENT_BY_ID = "api/v1/student/";
        public static final String CREATE_STUDENT = "api/v1/student/create";
        public static final String UPDATE_STUDENT = "api/v1/student/update/";
        public static final String DELETE_STUDENT = "api/v1/student/delete/";
    }

    public static class UniversityAPI {
        public static final String GET_UNIVERSITY = "api/v1/university";
        public static final String GET_UNIVERSITY_STATUS_TRUE = "api/v1/university/university-status-true";
        public static final String GET_UNIVERSITY_BY_ID = "api/v1/university/";
        public static final String CREATE_UNIVERSITY = "api/v1/university/create";
        public static final String UPDATE_UNIVERSITY = "api/v1/university/update/";
        public static final String DELETE_UNIVERSITY = "api/v1/university/delete/";
    }

}
