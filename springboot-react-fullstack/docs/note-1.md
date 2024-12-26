# Understanding DOM Loading and useEffect in React 

## What's Component Mounting? 
Component Mounting refers to the phase in React's lifecycle when a component is rendered and inserted into the DOM for the first time. 
This process is critical in React as it ensures that the component is fully initialized and ready for interaction. 

--- 

## React Component Lifecycle Overview 
React components go through three primary lifecycle phases: 

- **Mounting(First-Time Load)**
> * The component is created and added to the DOM.
> * This happens during the initial render of the component. 
> * For class components: methods like constructor and componentDidMount are executed. 
> * For functional component: *useEffect* with an empty dependency array ([]) runs during this phase. 

- **Updating (Re-Renders)**
> * The component re-renders when its state or props change. 
> * For functional components: *useEffect* runs if the dependency array contains variables that have changed. 
- **Unmounting**
> * The component is removed form the DOM.
> * For functional components: cleanup functions (if defined in useEffect) are called. 

---

## What Does "First-Time Component Mounting" Mean? 
For **functional components**, the term "first-time mounting" describes the moment when the component is render for the first time and inserted into the DOM. 
This occurs during the initial render of the application or when a new component is loaded through routing or conditional rendering. 


--- 
## What Does "Render" Mean in React ? 

**Render** in React refers to the process of transforming React components into HTML elements that are displayed on the web page.
This process(render) happens when React calls the component's function (for functional components) or the `render()` method(for those class type components) to determine what the UI should look like. 

## What is the "Initial Render" ? 

--- 
## Introduction to React Component and App Initialization 

### What are React Components? 
In React, components are the building blocks of our UI. Think of components are reusable pieces of code that describe part of the interface.
React has two main types of componets: 

#### 1. Functional Components
These are JavaScript functions that return **JSX**(a syntax similar to HTML). They are simple, easier to write and commonly used in modern React applications. 

```javascript
function Greeting() {
    return <h1>Hello, World</h1>; 
}
```

#### 2. Class Components 
These are ES6 classes that extend React.Component. They have their own lifecycle methods and state. 
```javascript
class  Greeting extends React.Component {
    render() {
        return <h1>Hello, world!</h1>; 
    }
}
```
#### Components' LifeCycle 


#### Components' Features 
- **Reusability**: Components can be reused across the application to maintain a consistent look and reduce duplication.
- **Isolation**: Each component is self-contained, meaning its logic and style won't interfere with other components. 
- **Modularity**: Complex UIs can be broken down into smaller, manageable components for better readability and maintainability. 
- **Composition** Components can be nested, meaning one component can include or use another. 
```javascript
function App() {
    return <div>
        <Greeting name="Emma" />
        <Greeting name="John" />
    </div>; 
}
```
- **State and Props** 
> **State**: Managed locally within a component.
> <br/>
> **Props**: Passed from a parent component to a child, making it customize.  


--- 

## 
