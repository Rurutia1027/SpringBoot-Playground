import fetch from 'unfetch';

const checkStatus = res => {
    if (res.ok) {
        return res;
    }

    // convert non-2xx HTTP responses into errors
    const error = new Error(res.statusText);
    error.response = res;
    return Promise.reject(error);
};

export const getAllStudents = () =>
    fetch('api/v1/students')
        .then(checkStatus);

export const addNewStudent = student => {
    return fetch('api/v1/students', {
            headers: {
                'Content-Type': 'application/json',
            },
            method: 'POST',
            body: JSON.stringify(student),
        }
    ).then(checkStatus);
}

export const deleteStudent = studentId =>
    fetch(`api/v1/${studentId}`, {
            method: 'DELETE',
        }
    ).then(checkStatus);


// actually this invokes the same API as getAllStudents
export const refresh = () => {
    fetch('api/v1/students')
        .then(checkStatus);
}